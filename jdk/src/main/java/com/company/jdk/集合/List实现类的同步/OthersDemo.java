package com.company.jdk.集合.List实现类的同步;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 通过重入锁实现集合的线程安全，适用于所有非线程安全的集合，这里用ArrayList示例
* 测试目的：是否达到了集合的线程安全目的
* 测试结果：weezy>false;riri>true;则测试通过
* */
public class OthersDemo {
    public static void main(String[] args) {
        MyService myService = new MyService(new ArrayList<String>());
        MyThread myThread = new MyThread(myService);
        myThread.start();
        try{
            Thread.currentThread().sleep(1000);
        }catch (Exception e){

        }
        myService.service();
    }

    static class MyThread extends Thread{

        private MyService myService;

        public MyThread(MyService myService) {
            this.myService = myService;
        }

        @Override
        public void run() {
            myService.service2();
        }
    }

    static class MyService{
        private ArrayList<String> list;
        private Lock lock = new ReentrantLock();

        public MyService(ArrayList<String> list) {
            this.list = list;
        }

        public ArrayList<String> getList() {
            return list;
        }

        public void setList(ArrayList<String> list) {
            this.list = list;
        }

        public Lock getLock() {
            return lock;
        }

        public void setLock(Lock lock) {
            this.lock = lock;
        }

        public void service(){
            lock.lock();
            try{
                list.add("weezy");
                System.out.println("list包含riri吗？"+list.contains("riri"));
            }catch (Exception e){

            }finally {
                lock.unlock();
            }
        }
        public void service2(){
            lock.lock();
            try{
                Thread.currentThread().sleep(3000);
                System.out.println("list包含weezy吗？"+list.contains("weezy"));
                list.add("riri");
            }catch (Exception e){

            }finally {
                lock.unlock();
            }
        }
    }
}
