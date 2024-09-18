package jessylavorel.exercices.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author 20008590
 */
@Data
@Builder
public class Person {
    private long number;
    private String lastName;
    private String firstName;
    private int age;
}
