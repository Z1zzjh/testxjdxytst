package com.zjh.testxjdxytst;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;

@Aspect
@Component
public class Aspect11q {
    //@Pointcut(value = "execution(* com.zjh.testxjdxytst.Controller.*(..)) ")
    @Pointcut(value = "@annotation(com.zjh.testxjdxytst.Aopppaaa)")
    public void failResult(){}

    @Before("failResult()&& @annotation(aopppaaa)")
    public void beforeLog(Aopppaaa aopppaaa){
        System.out.println("111111111qqqqqqqqqqqqqq");
        System.out.println(aopppaaa.methodName());

    }


    public static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            if (s.length()==0) return 0;
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int max = 0;
            int left = 0;
            for(int i = 0; i < s.length(); i ++){
                if(map.containsKey(s.charAt(i))){
                    left = map.get(s.charAt(i)) + 1;
                }
                map.put(s.charAt(i),i);
                max = Math.max(max,i-left+1);
            }
            return max;

        }
    }

    public static void main(String[] args){
        Solution.lengthOfLongestSubstring("abba");


    }


}
