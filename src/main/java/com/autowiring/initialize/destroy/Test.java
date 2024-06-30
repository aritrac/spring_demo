package com.autowiring.initialize.destroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Test implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Test: destroy method called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Test: init method called");
    }
}
