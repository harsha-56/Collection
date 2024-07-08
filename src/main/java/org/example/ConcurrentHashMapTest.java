package org.example;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public class ConcurrentHashMapTest {
    private static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();

//    private static ExecutorService service = Executors.newFixedThreadPool(3);
//

    public static void main(String[] args) throws InterruptedException {
        orders.put("rkp", new AtomicLong());
        orders.put("ktr", new AtomicLong());
        orders.put("wngl", new AtomicLong());
        orders.put("hnk", new AtomicLong());
        for (int i = 0; i < 10; i++) {
            ExecutorService service = Executors.newFixedThreadPool(3);


            service.submit(ConcurrentHashMapTest::processOrders);
            service.submit(ConcurrentHashMapTest::processOrders);
            service.submit(ConcurrentHashMapTest::processOrders);
            service.awaitTermination(3, TimeUnit.SECONDS);
            service.shutdown();
            System.out.println(orders);
        }


    }

    private static void processOrders() {
        for (String city : orders.keySet()) {
            for (int i = 0; i < 50; i++) {
                AtomicLong oldOrder = orders.get(city);
                oldOrder.getAndIncrement();
                orders.put(city, oldOrder);
            }
        }
    }
}
 