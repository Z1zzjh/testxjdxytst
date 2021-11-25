package com.zjh.testxjdxytst.service;

public class AopTestImpl implements AopTest{

    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void updaate() {
        System.out.println("更新");

    }
}
