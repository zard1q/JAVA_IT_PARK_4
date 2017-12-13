import lombok.*;
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@Builder


class Human {

    private Long id;
    private String name;
    private int age;
    private String citizen;
}