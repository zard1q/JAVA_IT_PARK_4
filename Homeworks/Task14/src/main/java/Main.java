import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    private static final String URL = "jdbc:postgresql://localhost:5432/new";
    private static final String USER = "postgres";
    private static final String PASSWORD = "q1w2e3";

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASSWORD);

        HumansDao humansDao = new HumansDaoJdbcTemplateImpl(dataSource);

        HumanService service = new HumanService(humansDao);

        Human human = Human.builder()
                .age(65)
                .citizen("Австралия ")
                .name("Anatoly")
                .build();

        service.registerUser(human);
        System.out.println(service.showAll());
        System.out.println(service.findUser(1l));
        service.deleteUser(human);
        System.out.println(service.showAll());
        service.updateUser(Human.builder()
        .age(25)
        .name("Vasily")
        .citizen("Brazilia")
        .id(1l)
        .build());
        System.out.println(service.showAll());

        Car car = Car.builder()
                .model("Mercedez Benz")
                .number(444)
                .color("Black")
                .build();

        CarsDao carsDao = new CarsDaoJdbcTemplateImpl(dataSource);
        CarService carservice = new CarService(carsDao);
        carservice.registerCar(car);
        System.out.println(carservice.showAll());

    }
}