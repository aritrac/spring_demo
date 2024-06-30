package com.autowiring.initialize.destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TestInitDestroyWithAnnotations {
    @PostConstruct
    public void init() throws Exception {
        System.out.println("TestInitDestroyWithAnnotations: init method");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("TestInitDestroyWithAnnotations: destroy method");
    }
}
