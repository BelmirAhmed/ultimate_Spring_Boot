package com.ultimate_spring_boot.restful;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;






@RestController
public class FirstController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello from First Controller ";
    }
    
    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String post( @RequestBody String message) {
        
        return " the post message is : "+message;
    }
    
    @PostMapping("/post-order")
    @ResponseStatus(HttpStatus.CREATED)
    public String postOrder(@RequestBody Order order ) {
        return order.toString();
    }
    
    @PostMapping("/post-order-record")
    @ResponseStatus(HttpStatus.CREATED)
    public String postOrderRecord(@RequestBody OrderRecord orderRecord ) {
        return orderRecord.toString();
    }
    

    @GetMapping("/hello/{val}")
    @ResponseStatus(HttpStatus.CREATED)
    public String pathVar(@PathVariable("val")int val) {
        return "My value = "+val;
    }

    @GetMapping("/requestparams")
    @ResponseStatus(HttpStatus.CREATED)
    public String requestParams(@RequestParam("user-name")String userName,@RequestParam("user-lastname")String userLastName) {
        return "User Name = "+userName+" "+" Last name : "+userLastName;
    }

}
