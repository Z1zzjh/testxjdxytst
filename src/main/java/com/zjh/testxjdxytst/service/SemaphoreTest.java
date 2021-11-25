//package com.zjh.testxjdxytst.service;
//
//import java.util.concurrent.Semaphore;
//import java.util.concurrent.TimeUnit;
//
//public class SemaphoreTest {
//    public static void main(String[] args){
//        Semaphore semaphore = new Semaphore(3);
//        for(int i = 0;i<10;i++) {
//            new Thread(() -> {
//                try{
//                    semaphore.acquire();
//                    System.out.println(Thread.currentThread().getName()+"获取资源");
//                    TimeUnit.SECONDS.sleep(2);
//                    System.out.println(Thread.currentThread().getName()+"释放资源");
//                }catch (Exception e){
//                    System.err.println(e.toString());
//                }finally {
//                    semaphore.release();
//                }
//            },String.valueOf(i)).start();
//        }
//    }
//}
