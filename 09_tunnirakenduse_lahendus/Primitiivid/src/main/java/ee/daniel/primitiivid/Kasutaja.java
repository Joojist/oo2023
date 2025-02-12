package ee.daniel.primitiivid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Kasutaja {
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
