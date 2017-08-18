package com.xuqian.java8.concurrent;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic1 {

    private static final int NUM_INCREMENTS = 1000;

    private static AtomicInteger atomicInt = new AtomicInteger(0);

    public static  void main(String[] args) {

    }


    private static void testUpdate() {
        atomicInt.set(0);

        ExecutorService executorService = Executors.newFixedThreadPool(2);




    }

}
