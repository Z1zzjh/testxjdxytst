package com.zjh.testxjdxytst.jvm;

/**
 * @program: testxjdxytst
 * @description: 1
 * @author: zhujianhong
 * @create: 2021-10-29 11:38
 */
public class StaticString {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello"; //都在编译时常量池

        String s3 = new String("1")+new String("1");
        s3.intern();
        String s4 = "11";//在编译时常量池
        System.out.println(s4==s3);
    }
}
