package ee.daniel.kt_2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Kaubanduskeskus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nimetus;

    @JsonIgnore
    @OneToMany(mappedBy = "kaubanduskeskus", cascade = CascadeType.ALL)
    private List<Pood> poed;

}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
class Pood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nimetus;
    private String avamiseAeg;
    private String sulgemiseAeg;
    private int kylastajateArv;

    @ManyToOne
    @JoinColumn(name = "kaubanduskeskus_id")
    private Kaubanduskeskus kaubanduskeskus;

}


