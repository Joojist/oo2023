package ee.daniel.kt_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoodService {
    private final PoodRepository poodRepository;

    @Autowired
    public PoodService(PoodRepository poodRepository) {
        this.poodRepository = poodRepository;
    }

    public Pood salvestaPood(Pood pood) {
        return poodRepository.save(pood);
    }

    public boolean kasOnLahti(Long poodiId, String kellaaeg) {
        Pood pood = poodRepository.findById(poodiId).orElse(null);
        if (pood != null) {
            String avamiseAeg = pood.getAvamiseAeg();
            String sulgemiseAeg = pood.getSulgemiseAeg();
            return kellaaeg.compareTo(avamiseAeg) >= 0 && kellaaeg.compareTo(sulgemiseAeg) <= 0;
        }
        return false;
    }

    public void suurendaKylastajateArvu(Long poodiId) {
        Pood pood = poodRepository.findById(poodiId).orElse(null);
        if (pood != null) {
            pood.setKylastajateArv(pood.getKylastajateArv() + 1);
            poodRepository.save(pood);
        }
    }
}
