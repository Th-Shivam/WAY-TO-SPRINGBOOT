package com.vayu.xmlconfigrautiondemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XmlConfigrautionDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
    }

}
