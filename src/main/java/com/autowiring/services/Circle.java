package com.autowiring.services;

import com.autowiring.interfaces.Shape;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Circle implements Shape {
    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_UNCOMMITTED,
            rollbackFor = Exception.class
    )
    public String process(){
        return "Database transaction success";
    }
}
