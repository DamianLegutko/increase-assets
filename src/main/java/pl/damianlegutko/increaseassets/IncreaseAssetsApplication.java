package pl.damianlegutko.increaseassets;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.damianlegutko.increaseassets.config.YAMLConfig;

@SpringBootApplication
@Slf4j
public class IncreaseAssetsApplication implements CommandLineRunner {

        @Autowired
        private YAMLConfig myConfig;

        public static void main(String[] args) {
            SpringApplication app = new SpringApplication(IncreaseAssetsApplication.class);
            app.run();
        }

        public void run(String... args) throws Exception {
            log.debug("using environment: " + myConfig.getEnvironment());
            log.debug("name: " + myConfig.getName());
            log.debug("servers: " + myConfig.getServers());
        }
    }