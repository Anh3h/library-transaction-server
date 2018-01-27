package courage.library.transactionserver.configuration;

import com.github.mongobee.Mongobee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public Mongobee mongobee(){
        String db = env.getProperty("spring.data.mongodb.database");
        String host = env.getProperty("spring.data.mongodb.host");
        String port = env.getProperty("spring.data.mongodb.port");
        String dburi = "mongodb://" + host + ":" + port + "/" + db;

        Mongobee runner = new Mongobee(dburi);
        runner.setChangeLogsScanPackage("courage.library.transactionserver.changelog");

        return runner;
    }
}
