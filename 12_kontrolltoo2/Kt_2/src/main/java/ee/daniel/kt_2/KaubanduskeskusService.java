package ee.daniel.kt_2;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KaubanduskeskusService {
    private final KaubanduskeskusRepository kaubanduskeskusRepository;
    private final PoodRepository poodRepository;

    public KaubanduskeskusService(KaubanduskeskusRepository kaubanduskeskusRepository, PoodRepository poodRepository) {
        this.kaubanduskeskusRepository = kaubanduskeskusRepository;
        this.poodRepository = poodRepository;
    }

    public int kokkuKulastatudPoed(Long kaubanduskeskusId) {
        Optional<Kaubanduskeskus> kaubanduskeskusOptional = kaubanduskeskusRepository.findById(kaubanduskeskusId);
        if (kaubanduskeskusOptional.isEmpty()) {
            throw new EntityNotFoundException("Kaubanduskeskus not found");
        }

        Kaubanduskeskus kaubanduskeskus = kaubanduskeskusOptional.get();
        List<Pood> poed = kaubanduskeskus.getPoed();

        int kokkuKulastatudPoed = 0;
        for (Pood pood : poed) {
            kokkuKulastatudPoed += pood.getKylastajateArv();
        }

        return kokkuKulastatudPoed;
    }
    public List<Pood> lahtiolevadPoed(Long kaubanduskeskusId, LocalTime kellaaeg) {
        Optional<Kaubanduskeskus> kaubanduskeskusOptional = kaubanduskeskusRepository.findById(kaubanduskeskusId);
        if (kaubanduskeskusOptional.isEmpty()) {
            throw new EntityNotFoundException("Kaubanduskeskus not found");
        }

        Kaubanduskeskus kaubanduskeskus = kaubanduskeskusOptional.get();
        List<Pood> poed = kaubanduskeskus.getPoed();

        List<Pood> lahtiolevadPoed = new ArrayList<>();
        for (Pood pood : poed) {
            if (kellaaeg.isAfter(LocalTime.parse(pood.getAvamiseAeg())) && kellaaeg.isBefore(LocalTime.parse(pood.getSulgemiseAeg()))) {
                lahtiolevadPoed.add(pood);
            }
        }

        return lahtiolevadPoed;
    }
}
