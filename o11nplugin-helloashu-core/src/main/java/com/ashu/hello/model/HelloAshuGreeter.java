package com.ashu.hello.model;

import org.springframework.beans.factory.annotation.Autowired;

import ch.dunes.vso.sdk.api.IPluginFactory;

import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;

@VsoObject(singleton = true)
public class HelloAshuGreeter {
    public static final String TYPE = "HelloAshuGreeter";
    
    @Autowired
    private HelloAshuGreetingService service;


    public HelloAshuGreeter() {
    }

    public static HelloAshuGreeter createScriptingSingleton(IPluginFactory factory) {
        return ((AbstractSpringPluginFactory) factory).createScriptingObject(HelloAshuGreeter.class);
    }

    @VsoMethod
    public String greet(String name) {
        return service.greet(name);
    }
}
