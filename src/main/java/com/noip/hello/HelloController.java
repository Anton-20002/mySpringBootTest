package com.noip.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anton on 13.08.2018.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World!!!";
    }
}
