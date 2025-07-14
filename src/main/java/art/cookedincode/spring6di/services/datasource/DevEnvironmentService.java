package art.cookedincode.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Georgi Ivanov
 */
@Profile({"dev", "default"})
@Service("datasourceService")
public class DevEnvironmentService implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "DEV";
    }
}
