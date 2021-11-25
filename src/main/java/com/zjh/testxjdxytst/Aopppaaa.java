package com.zjh.testxjdxytst;

import java.lang.annotation.*;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Aopppaaa {
    // 方法名称
    String methodName();

    // 发送的目标队列
    String queue();
}
