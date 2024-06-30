package com.autowiring.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    ComponentB compB;

    @Autowired
    public ComponentA(ComponentB compB){
        this.compB = compB;
        System.out.println("ComponentB autowired via constructor");
    }
}
