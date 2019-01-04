
package com.test.riskflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class RiskItemServletProcessApplication {

  public static void main(String[] args) {
    SpringApplication.run(RiskItemServletProcessApplication.class, args);
  }
}
