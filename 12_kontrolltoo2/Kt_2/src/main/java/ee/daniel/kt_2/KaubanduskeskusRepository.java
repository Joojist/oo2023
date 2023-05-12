package ee.daniel.kt_2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.List;

public interface KaubanduskeskusRepository extends JpaRepository<Kaubanduskeskus, Long> {
}

interface PoodRepository extends JpaRepository<Pood, Long> {
    List<Pood> findByKaubanduskeskusAndAvamiseAegLessThanEqualAndSulgemiseAegGreaterThanEqual(
            Kaubanduskeskus kaubanduskeskus, LocalTime avamiseAeg, LocalTime sulgemiseAeg);
}
