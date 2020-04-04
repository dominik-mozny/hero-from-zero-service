package cz.mozny.dominik;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(value = "/hello")
    public String getQuestions() {
        return "Hello World";
    }
}
