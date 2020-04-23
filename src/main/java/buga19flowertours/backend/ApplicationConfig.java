package buga19flowertours.backend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * General Application Config
 */
@Configuration
@ComponentScan("buga19flowertours")
@EnableAsync
public class ApplicationConfig {

}
