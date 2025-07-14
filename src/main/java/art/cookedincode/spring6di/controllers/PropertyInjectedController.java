package art.cookedincode.spring6di.controllers;

import art.cookedincode.spring6di.services.GreetingService;

/**
 * Created by Georgi Ivanov
 */
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
