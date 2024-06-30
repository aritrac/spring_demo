package com.autowiring.advices;

import com.autowiring.controllers.ShapeController;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLException;

@ControllerAdvice(assignableTypes = ShapeController.class)
public class SpecificControllerAdvice {
    @ExceptionHandler(SQLException.class)
    public String handleSQLException(){
        return null;
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public String handleUsernameNotFoundException(){
        return null;
    }
}
