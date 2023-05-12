//package ee.daniel.kt_2;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Entity
//public class Pood {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String nimetus;
//    private String avamiseAeg;
//    private String sulgemiseAeg;
//    private int kylastajateArv;
//    @ManyToOne
//    @JoinColumn(name = "kaubanduskeskus_id")
//    private Kaubanduskeskus kaubanduskeskus;
//
//    // konstruktorid, getterid, setterid jne
//}