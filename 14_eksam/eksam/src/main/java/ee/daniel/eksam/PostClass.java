package ee.daniel.eksam;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class PostClass {
    @Id
    private UUID uuid;

    @Column()
    private String url;

    @Column(length = 1000)
    private String image;

    public PostClass(String instagramUrl, String imageUrl) {
        uuid = UUID.randomUUID();
        url = instagramUrl;
        image = imageUrl;
    }
}
