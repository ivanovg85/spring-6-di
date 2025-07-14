package art.cookedincode.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Georgi Ivanov
 */
@Profile("qa")
@Service("datasourceService")
public class QaEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "QA";
    }
}
