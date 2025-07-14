package art.cookedincode.spring6di.services;

import org.springframework.stereotype.Service;

/**
 * Created by Georgi Ivanov
 */
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!";
    }
}
