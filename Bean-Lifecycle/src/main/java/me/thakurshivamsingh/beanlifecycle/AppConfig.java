package me.thakurshivamsingh.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("me.thakurshivamsingh")
public class AppConfig {

    @Bean(initMethod = "start2" , destroyMethod = "stop")
    public CartService cartInit(){
        return new CartService();
    }
}
