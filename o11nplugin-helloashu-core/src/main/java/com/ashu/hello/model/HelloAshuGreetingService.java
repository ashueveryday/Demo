package com.ashu.hello.model;

import org.springframework.stereotype.Component;

import com.vmware.o11n.plugin.sdk.annotation.*;

@Component
public class HelloAshuGreetingService  {
    
    public HelloAshuGreetingService() {
        
    }
   
   public String greet(String name) {
       return "Hello, " + name +"! Welcome to 'HelloAshu' plug-in";
   }
}

