package com.autowiring.services;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateDemo {
    public String getUserNameById() {
        //In this example, we are consuming a GET web service and converting the response to the object of User class
      User user =  new RestTemplate().getForObject("http://localhost:8080/getUser/1", User.class);
      //Similarly, there are other methods to consume POST, DELETE web services like exchange() and delete() respectively
      return user.getName();
    }
}
