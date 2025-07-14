package art.cookedincode.spring6di.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Georgi Ivanov
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("I'm in the controller");

        return "Hello Everyone!!!";
    }
}
