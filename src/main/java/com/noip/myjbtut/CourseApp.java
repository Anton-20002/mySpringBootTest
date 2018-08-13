package com.noip.myjbtut;

import com.noip.hello.HelloController;
import com.noip.topic.TopicController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Anton on 13.08.2018.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = TopicController.class)

public class CourseApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApp.class,args);
    }
}
