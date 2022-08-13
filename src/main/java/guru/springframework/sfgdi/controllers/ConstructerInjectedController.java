package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * BEST PRACTICE!!!
 */
@Controller
public class ConstructerInjectedController {
    private final GreetingService greetingService;
    //Optional @Autowired
    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetings() {
        return greetingService.sayGreetings();
    }
}
