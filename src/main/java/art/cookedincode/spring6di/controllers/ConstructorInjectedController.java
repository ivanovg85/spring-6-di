package art.cookedincode.spring6di.controllers;

import art.cookedincode.spring6di.services.GreetingService;

/**
 * Created by Georgi Ivanov
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
