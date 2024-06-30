package com.autowiring.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class ADemoRestController {
    @RequestMapping("/getById")
    public String getById(@RequestParam(value = "id") String requestId) {
        return "dummy response";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post() {
        return "Post request";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String put() {
        return "Put request";
    }

    @RequestMapping(method = RequestMethod.PATCH)
    public String patch() {
        return "Patch request";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String delete() {
        return "Delete request";
    }

    @GetMapping("/getByName/{name}")
    public String getMapping(@PathVariable String name) {
        return "Get";
    }

    @PostMapping("/saveUser")
    public String postMapping() {
        return "Post";
    }

    /**
     * How to map incoming RequestBody as JSON to a Java POJO. We can use the RequestBody annotation for the same
     */
    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    public String createUser(@RequestBody User user) {
        return "Created user: " + user.getName();
    }

    private class User {
        String name;
        public String getName(){
            return this.name;
        }
    }
}
