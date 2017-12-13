import java.util.List;

public class CarService {

    private CarsDao carsDao;

    public CarService(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public void registerCar(Car car) {
        // смотрим, нет ли человека с таким именем,
        int number = car.getNumber();

        Car existingCar = carsDao.findOneByNumber(number);

        if (existingCar != null) {
            // если есть - выбрасываем ошибку, если нет - сохраняем
            throw new IllegalArgumentException("Already exist");
        }

        carsDao.save(car);

    }

    public void deleteCar (Car car) {
        int number = car.getNumber();
        Car existingCar = carsDao.findOneByNumber(number);
        if (existingCar != null) {
            carsDao.delete(existingCar.getId());
        }
    }

    public Car findCar(Long id) {
        Car existingCar = carsDao.find(id);
        if (existingCar != null) {
            return existingCar;
        }
        return null;
    }

    public void updateCar(Car car) {
        carsDao.update(car);
    }
    public List<Car> showAll() {
        return carsDao.findAll();

    }
}
