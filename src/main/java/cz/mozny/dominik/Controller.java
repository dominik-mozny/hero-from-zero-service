package cz.mozny.dominik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running.";
    }

    @RequestMapping(value = "/hello")
    public String getQuestions() {
        return "Hello World";
    }
}
