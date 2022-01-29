import lombok.AllArgsConstructor;
import lombok.ToString;

@MyAnnot(departmentName = "Biological")
@AllArgsConstructor
@ToString
public class BiologyStudent {
    private String firstName;
    private String lastName;
    private int course;
}