package art.cookedincode.spring6di.controllers;

import art.cookedincode.spring6di.services.GreetingService;
import art.cookedincode.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Georgi Ivanov
 */
@Controller
public class MyI18NController {

    private final GreetingService greetingService;

    public MyI18NController(@Qualifier("i18NService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
