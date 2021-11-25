package com.zjh.testxjdxytst.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@Aspect
@Component
public class TestAop {
    @Before("execution(* com.zjh.testxjdxytst.Controller.*(..))")
    public void befff(){
        Map map = new HashMap();
        map.put("123","133");
        map.put("123","1334411");
        CountDownLatch countDownLatch = new CountDownLatch(10);
        countDownLatch.countDown();
        System.out.println("执行前");
    }
}
