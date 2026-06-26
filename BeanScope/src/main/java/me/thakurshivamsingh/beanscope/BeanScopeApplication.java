package me.thakurshivamsingh.beanscope;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanScopeApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;
        Order order = context.getBean(Order.class);
        order.placeOrder();
        Order order2 = context.getBean(Order.class);
        System.out.println(order == order2);
    }

}
