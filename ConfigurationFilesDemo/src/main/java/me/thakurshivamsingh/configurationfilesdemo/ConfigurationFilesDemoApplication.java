package me.thakurshivamsingh.configurationfilesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationFilesDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConfigurationFilesDemoApplication.class, args);
        PaymentGateway pg =  context.getBean(PaymentGateway.class);
//        pg.setRetryCount(3);
//        pg.setType("Paytm");
        System.out.println(pg.getType() + " " + pg.getRetryCount());
    }

}
