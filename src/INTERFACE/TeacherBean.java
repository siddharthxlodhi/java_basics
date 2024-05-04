package INTERFACE;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherBean {
    String firstname;
    String subject;
    double salary ;
    int id;
}
