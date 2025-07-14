package art.cookedincode.spring6di.controllers.datasource;

import art.cookedincode.spring6di.controllers.EnvironmentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by Georgi Ivanov
 */
@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class DevEnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}