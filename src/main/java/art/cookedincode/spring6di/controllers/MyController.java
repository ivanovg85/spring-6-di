package art.cookedincode.spring6di.controllers;

import art.cookedincode.spring6di.services.GreetingService;
import art.cookedincode.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Created by Georgi Ivanov
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
