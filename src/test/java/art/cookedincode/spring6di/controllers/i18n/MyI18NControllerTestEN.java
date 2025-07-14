package art.cookedincode.spring6di.controllers.i18n;

import art.cookedincode.spring6di.controllers.MyI18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by Georgi Ivanov
 */
@ActiveProfiles("EN")
@SpringBootTest
class MyI18NControllerTestEN {

    @Autowired
    MyI18NController myI18NController;

    @Test
    void sayHello() {
        System.out.println(myI18NController.sayHello());
    }
}