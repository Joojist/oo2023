package ee.daniel.kt_2;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/kaubanduskeskused")
public class KaubanduskeskusController {
    private final KaubanduskeskusService kaubanduskeskusService;

    public KaubanduskeskusController(KaubanduskeskusService kaubanduskeskusService) {
        this.kaubanduskeskusService = kaubanduskeskusService;
    }

    @GetMapping("/{kaubanduskeskusId}/poed/{kellaaeg}")
    public List<Pood> lahtiolevadPoed(
            @PathVariable Long kaubanduskeskusId,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime kellaaeg) {
        return kaubanduskeskusService.lahtiolevadPoed(kaubanduskeskusId, kellaaeg);
    }

    @GetMapping("/{kaubanduskeskusId}/kokku-kulastatud-poed")
    public int kokkuKulastatudPoed(@PathVariable Long kaubanduskeskusId) {
        return kaubanduskeskusService.kokkuKulastatudPoed(kaubanduskeskusId);
    }
}
