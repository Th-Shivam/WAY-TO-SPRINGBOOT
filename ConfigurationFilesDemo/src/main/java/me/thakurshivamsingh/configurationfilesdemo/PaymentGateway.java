package me.thakurshivamsingh.configurationfilesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
    @Value("${PaymentGateway.type}")
    private String type;

    @Value("${PaymentGateway.retry-count}")
    private int retryCount;

//    public PaymentGateway(@Value("${PaymentGateway.type}")String type,@Value("${PaymentGateway.retry-count}") int retryCount) {
//        this.type = type;
//        this.retryCount = retryCount;
//    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getRetryCount() {
        return retryCount;
    }
}
