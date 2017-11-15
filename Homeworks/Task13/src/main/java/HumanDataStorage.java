
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class HumanDataStorage extends JdbcTemplate {
    private static final String URL = "jdbc:postgresql://localhost:5432/new ";
    private static final String USER = "postgres";
    private static final String PASSWORD = "q1w2e3";

    //language=SQL
    private static final String SQL_INSERT_USER =
            "INSERT INTO owner(age, name, citizen) VALUES (?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_ALL =
            "SELECT * FROM owner";

    private static final String SQL_FIND_BY_ID =
            "SELECT * FROM owner WHERE id = ?";

    private static final String SQL_FIND_BY_NAME =
            "SELECT * FROM owner WHERE name = ?";

    private static final String SQL_FIND_BY_AGE =
            "SELECT * FROM owner WHERE age = ?";

    private static final String SQL_FIND_BY_CITIZEN =
            "SELECT * FROM owner WHERE citizen = ?";
    JdbcTemplate template;
    HumanRowMapper rowMapper = new HumanRowMapper();

    public HumanDataStorage() {
       // создаем объект, который хранит информацию о подключении
       // раньше мы сами все это передавали в DriverManager и
       // сами создавали Connection
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("org.postgresql.Driver");
       dataSource.setUrl(URL);
       dataSource.setUsername(USER);
       dataSource.setPassword(PASSWORD);
       // данный DataSource передаем JdbcTemplate и он уже сам решит,
       // как работать с Connection
       template = new JdbcTemplate(dataSource);
    }

    public void addHuman(int age, String name, String citizen) {
        // никаких Statement и PreparedStatement
        template.update(SQL_INSERT_USER, age, name, citizen);
    }

    public List<Human> getAll() {
        return template.query(SQL_SELECT_ALL, rowMapper);
    }
    public List<Human> getByName(String name) {
        return template.query(SQL_FIND_BY_NAME, rowMapper, name);
    }
    public List<Human> getByAge(int age) {
        return template.query(SQL_FIND_BY_AGE, rowMapper, age);
    }
    public List<Human> getByCitizen(String citizen) {
        return template.query(SQL_FIND_BY_CITIZEN, rowMapper, citizen);
    }



//        System.out.println(humans);
//        Human human = template.queryForObject(SQL_FIND_BY_ID, rowMapper, 1);
//        Human human1 = template.queryForObject(SQL_FIND_BY_NAME, rowMapper, "Инокентий");
//        List<Human> humans2  = template.query(SQL_FIND_BY_AGE, rowMapper, 23);
//        Human human3 = template.queryForObject(SQL_FIND_BY_CITIZEN, rowMapper, "Россия");

//        System.out.println(humans2);
}