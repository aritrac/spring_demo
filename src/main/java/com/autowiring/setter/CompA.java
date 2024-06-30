package com.autowiring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompA {
    CompB compB;

    @Autowired
    public void setCompB(CompB compB){
        this.compB = compB;
        System.out.println("Setter componentB autowired successfully");
    }
}
