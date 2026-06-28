package me.thakurshivamsingh.beanlifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

//@Component
public class CartService /*implements InitializingBean*/ {
    Map<Integer, String> mp ;

    public CartService() {
        mp = new HashMap<>();
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Initialization callback");
//        mp.put(0,"A");
//        mp.put(1,"B");
//    }

    public void start(){
        System.out.println("Initialization callback");
        mp.put(0,"A");
        mp.put(1,"B");
    }

    public void addToCart(){
        System.out.println("Adding to cart");
        System.out.println(mp.get(0));
    }

}
