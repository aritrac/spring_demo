package com.autowiring.controllers;

import com.autowiring.interfaces.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {
    @Autowired
    @Qualifier("circle")
    Shape shape;
}
