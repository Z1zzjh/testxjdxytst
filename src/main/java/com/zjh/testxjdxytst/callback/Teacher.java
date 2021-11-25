package com.zjh.testxjdxytst.callback;

public class Teacher implements Callback{
    private Student student;
    public Teacher(Student student){
        this.student = student;
    }
    public void ask(){
        student.resolve(this);
    }
    @Override
    public void tallAnswer(int ans) {
        System.out.println("answer is "+ans);
    }
    //掉用其他对象吧自己传进去，让他调自己的方法
}
