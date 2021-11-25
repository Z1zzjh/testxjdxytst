package com.zjh.testxjdxytst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestxjdxytstApplication {

    public static void main(String[] args)  {
        ConfigurableApplicationContext r = SpringApplication.run(TestxjdxytstApplication.class, args);
//        String[] name = r.getBeanDefinitionNames();
//        for(String s : name){
//            System.out.println(s);
//        }
    }

}
