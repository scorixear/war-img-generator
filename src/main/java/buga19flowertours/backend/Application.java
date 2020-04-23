package buga19flowertours.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Initialze the Spring application.
 */
@SpringBootApplication
public class Application {

  public static void main(String[] args) throws IOException {
    SpringApplication.run(Application.class, args);
  }

}
