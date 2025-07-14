package art.cookedincode.spring6di.controllers;

import art.cookedincode.spring6di.services.datasource.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Georgi Ivanov
 */
@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(@Qualifier("datasourceService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return environmentService.getEnvironment();
    }
}
