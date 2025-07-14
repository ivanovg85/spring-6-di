package art.cookedincode.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Georgi Ivanov
 */
@Profile("prod")
@Service("datasourceService")
public class ProdEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "PROD";
    }
}
