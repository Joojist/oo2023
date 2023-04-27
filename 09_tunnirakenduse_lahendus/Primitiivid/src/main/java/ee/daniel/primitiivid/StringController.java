package ee.daniel.primitiivid;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@RestController
public class StringController {
    @GetMapping("hello-world")
    public String helloWorld() {
        return "Hello world!";
    }
    @GetMapping("hello-variable/{nimi}")
    public String helloVariable(@PathVariable String nimi) {
        return "Hello " + nimi + "!";
    }
    @GetMapping("multiply/{nr1}/{nr2}")
    public Integer multiply(@PathVariable Integer nr1, @PathVariable Integer nr2) {
        return nr1 * nr2;
    }
    @GetMapping("do-logs/{arv}")
    public void doLogs(@PathVariable Integer arv) {
        for (int i = 0; i < arv; i++) {
            System.out.println("See on logi nr " + i);
        }
    }
    @GetMapping("/rng/{min}/{max}")
    public String getRandomNumber(@PathVariable("min") int min, @PathVariable("max") int max
    ) {
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        return "Your random number: " + randomNumber;
    }
    @GetMapping("/age/{yearOfBirth}/{month}/{day}")
    public String calculateAge(@PathVariable int yearOfBirth, @PathVariable int month, @PathVariable int day) {
        LocalDate birthdate = LocalDate.of(yearOfBirth, month, day);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthdate, today);
        int age = period.getYears();
        if (period.isNegative()) {
            age--;
        }
        return "Sa oled " + age + " aastat vana.";
    }
}