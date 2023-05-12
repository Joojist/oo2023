package ee.daniel.kt_2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pood")
public class PoodController {
    private final PoodService poodService;

    public PoodController(PoodService poodService) {
        this.poodService = poodService;
    }

    @PostMapping("/lisamine")
    public Pood lisapood(@RequestBody Pood pood) {
        return poodService.salvestaPood(pood);
    }

    @GetMapping("/kellaaeg/{poodiId}/{kellaaeg}")
    public boolean kasOnLahti(@PathVariable Long poodiId, @PathVariable String kellaaeg) {
        return poodService.kasOnLahti(poodiId, kellaaeg);
    }

    @PostMapping("/kylastus/{poodiId}")
    public void suurendaKylastajateArvu(@PathVariable Long poodiId) {
        poodService.suurendaKylastajateArvu(poodiId);
    }
}
