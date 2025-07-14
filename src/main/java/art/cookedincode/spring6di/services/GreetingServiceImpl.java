package art.cookedincode.spring6di.services;

/**
 * Created by Georgi Ivanov
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
