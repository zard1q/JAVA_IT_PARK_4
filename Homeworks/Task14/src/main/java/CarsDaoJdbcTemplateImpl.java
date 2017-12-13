import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class CarsDaoJdbcTemplateImpl implements CarsDao{
    //language = SQL
    private static final String SQL_FIND_BY_ID =
            "SELECT * FROM car WHERE id = ?";

    //language = SQL
    private static final String SQL_FIND_BY_NUMBER =
            "SELECT * FROM car WHERE number = ?";


    //language=SQL
    private static final String SQL_FIND_BY_MODEL =
            "SELECT * FROM car WHERE model = ?";

    //language=SQL
    private static final String SQL_INSERT_CAR =
            "INSERT INTO car(model, number, color) VALUES (?, ?, ?)";

    //language=SQL
    private static final String SQL_UPDATE_CAR =
            "UPDATE car SET model = ?, number = ?, color = ? WHERE id = ?";

    //language=SQL
    private static final String SQL_DELETE_CAR =
            "DELETE * FROM car WHERE id = ?";

    private static final String SQL_FIND_ALL =
            "SELECT * FROM car";
    private JdbcTemplate template;

    private RowMapper<Car> rowMapper = (resultSet, rowNum) -> {
        Car result = Car.builder()
                .id(resultSet.getLong("id"))
                .model(resultSet.getString("model"))
                .number(resultSet.getInt("number"))
                .color(resultSet.getString("color"))
                .build();

        return result;
    };

    public CarsDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public List<Car> findAllByModel(String model) {
        return template.query(SQL_FIND_BY_MODEL, rowMapper, model);
    }

    public Car findOneByNumber(int number) {
        List<Car> result = template.query(SQL_FIND_BY_NUMBER, rowMapper, number);
        if (result.size() > 0) {
            return result.get(0);
        }
        return null;
    }

    public void save(Car model) {
        template.update(SQL_INSERT_CAR, model.getModel(), model.getNumber(), model.getColor());
    }

    public Car find(Long id) {
        if(template.query(SQL_FIND_BY_ID, rowMapper, id).size() > 0){
            return  template.queryForObject(SQL_FIND_BY_ID, rowMapper, id);
        } else {
            throw new IllegalArgumentException("There is no such human");
        }
    }

    public void update(Car model) {
        template.update(SQL_UPDATE_CAR, model.getModel(), model.getNumber(), model.getColor(), model.getId());
    }

    public void delete(Long id) {
        if(template.query(SQL_FIND_BY_ID, rowMapper, id).size() > 0){
            template.update(SQL_DELETE_CAR , id);
        }else {
            throw new IllegalArgumentException("There is no such car");
        }
    }

    public List<Car> findAll() {
        return template.query(SQL_FIND_ALL, rowMapper);
    }


}
