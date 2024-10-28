package company.collection.hashmap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestAll {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);
// This includes the Thread.sleep time as well in the delay      // scheduler.scheduleWithFixedDelay(() -> {
        scheduler.scheduleAtFixedRate(() -> {
            long currentTimeSeconds = System.currentTimeMillis() / 1000;
            System.out.println("Task with fixed delay executed at:" + currentTimeSeconds + " ");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }, 0, 3, TimeUnit.SECONDS);
    }
}

    
    
    
    
    
    
//    **Executor**
//    public static void main(String[] args) {
//        ExecutorService me= Executors.newSingleThreadExecutor();
//        ExecutorService me= Executors.newFixedThreadPool(2);
//        ExecutorService me= Executors.newCachedThreadPool();
//        Runnable t1=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                System.out.println("Task 1......");
//            }
//        };
//
//        Runnable t2=() ->{
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Task 2......");
//        };
//
//        me.execute(t1);
//        me.execute(t2);
//        me.execute(new th3("Java"));
//    }









//Runnable t1=new Runnable() {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Task 1......");
//    }
//};
//
//Runnable t2=() ->{
//    System.out.println(Thread.currentThread().getName());
//    System.out.println("Task 2......");
//};
//
//        t1.run();
//        t2.run();