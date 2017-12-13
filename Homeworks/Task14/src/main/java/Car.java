import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString(exclude = "car")
@Builder

public class Car {
    private Long id;
    private String model;
    private int number;
    private String color;
    private Car car;
}
