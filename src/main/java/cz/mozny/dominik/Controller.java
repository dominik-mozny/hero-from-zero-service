package cz.mozny.dominik;

import cz.mozny.dominik.domain.Activity;
import cz.mozny.dominik.domain.ActivityRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@CrossOrigin
public class Controller {
    private final ActivityRepository activityRepository;
    private long i;

    public Controller(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
        i = 0;
    }


    @RequestMapping(value = "/name", produces = "application/json")
    public String getName() {
        Activity activity = new Activity();
        i++;
        activity.setId(i);
        activity.setName("Herr " + i);
        Optional<Activity> byId = activityRepository.findById(i);
        if(byId.isPresent()) {
            activityRepository.delete(byId.get());
        }
        activityRepository.save(activity);

        System.out.println("Number of activities: " + activityRepository.findAll().size());

        return "{\"name\": \"Test Subject: " + activityRepository.findById(i).get().getId() + "\"}";
    }
}
