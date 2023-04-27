package ee.daniel.primitiivid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeListController {
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1,"Koola", 1.5, true),
            new Toode(2,"Fanta", 1.0, false),
            new Toode(3,"Sprite", 1.7, true),
            new Toode(4,"Vichy", 2.0, true),
            new Toode(5,"Vitamin well", 2.5, true)
    ));
    @GetMapping("tooted")
    public List<Toode> saaTooted() {
        return tooted;
    }
    @GetMapping("kustuta-toode/{index}")
    public List<Toode> kustutaToode(@PathVariable int index) {
        tooted.remove(index);
        return tooted;
    }
    @GetMapping("kustuta-toode-variant-2/{index}")
    public String kustutaToodeVariant2(@PathVariable int index) {
        tooted.remove(index);
        return "Toode kustutatud!";
    }
    @GetMapping("lisa-toode/{nimi}/{hind}/{aktiivne}")
    public List<Toode> lisaToode(
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable boolean aktiivne) {
        int nextId = tooted.stream()
                .mapToInt(Toode::getId)
                .max()
                .orElse(0) + 1;
        tooted.add(new Toode(nextId, nimi, hind, aktiivne));
        return tooted;
    }
    @GetMapping("hind-dollaritesse/{kurss}")
    public List<Toode> hindDollaritesse(@PathVariable double kurss) {
//        for (int i = 0; i < tooted.size(); i++) {
//            double vanaHind = tooted.get(i).getHind();
//            double uusHind = vanaHind * kurss;
//            tooted.get(i).setHind(uusHind);
//        }  sobib nii For Each (ülal) kui Enhanced For tsükkel
        for (Toode toode : tooted) {
            double vanaHind = toode.getHind();
            double uusHind = vanaHind * kurss;
            toode.setHind(uusHind);
        }
        return tooted;
    }
    @DeleteMapping("kustuta-kogu-list")
    public String kustutaKoguList() {
        tooted.clear();
        return "Kõik tooted kustutatud!";
    }
    @GetMapping("muuda-aktiivsust-valeks")
    public List<Toode> muudaAktiivsustValeks() {
        for (Toode toode : tooted) {
            toode.setAktiivne(false);
        }
        return tooted;
    }
    @GetMapping("toode/{index}")
    public Toode saaToode(@PathVariable int index) {
        return tooted.get(index);
    }
    @GetMapping("kalleim-toode")
    public Toode kalleimToode() {
        Toode kalleim = null;
        double kalleimHind = 0.0;
        for (Toode toode : tooted) {
            if (toode.getHind() > kalleimHind) {
                kalleim = toode;
                kalleimHind = toode.getHind();
            }
        }
        return kalleim;
    }
}