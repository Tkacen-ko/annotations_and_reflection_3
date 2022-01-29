import lombok.AllArgsConstructor;
import lombok.ToString;

@MyAnnot(departmentName = "Mathematics")
@AllArgsConstructor
@ToString
public class MathStudent {
    private String firstName;
    private String lastName;
    private int course;
}