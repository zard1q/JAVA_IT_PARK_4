
import java.util.List;

public interface CarsDao extends CrudDao<Car> {
    List<Car> findAllByModel(String model);
    Car findOneByNumber(int number);
}

