package pl.altkom.asc.openshift.poc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot POC.");
    }
}