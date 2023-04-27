//package ee.daniel.primitiivid;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class ToodeController {
//
//    @GetMapping("toode")
//    public Toode saaToode() {
//        return toode;
//    }
//    @PutMapping("/nimi/{uusNimi}")
//    public Toode muudaTooteNimi(@PathVariable String uusNimi) {
//        toode.setNimi(uusNimi);
//        return toode;
//    }
//
//    @GetMapping("kustuta-toode1")
//    public void kustutaToode1() {
//        toode = null;
//    }
//
//    @GetMapping("kustuta-toode2")
//    public String kustutaToode2() {
//        toode = null;
//        return "Edukalt kustutatud!";
//    }
//
//    @GetMapping("suurenda-hinda")
//    public Toode suurendaHinda() {
//        toode.setHind( toode.getHind()+1 );
//        return toode;
//    }
//
//    @GetMapping("aktiivsus")
//    public Toode muudaAktiivne() {
//        toode.setAktiivne(!toode.isAktiivne());
//        return toode;
//    }
//}