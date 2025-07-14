package art.cookedincode.spring6di.controllers;

import art.cookedincode.spring6di.services.GreetingService;

/**
 * Created by Georgi Ivanov
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
