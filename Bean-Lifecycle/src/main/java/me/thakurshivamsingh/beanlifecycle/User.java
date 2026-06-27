package me.thakurshivamsingh.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class User implements BeanNameAware , ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // This is an Initialization callback method .
        // Invoked automatically when the bean is created and assembled
        System.out.println("Application context is => " + applicationContext);
    }

    @Override
    public void setBeanName(String name) {
        // This is an Initialization callback method .
        // Invoked automatically when the bean is created and assembled
        System.out.println("Bean NameAware setBeanName called => " + name);
    }
}
