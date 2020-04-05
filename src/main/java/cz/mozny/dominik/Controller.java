package cz.mozny.dominik;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
    @RequestMapping(value = "/name", produces = "application/json")
    public String getName() {
        return "{\"name\": \"Dominik Mozny\"}";
    }
}
