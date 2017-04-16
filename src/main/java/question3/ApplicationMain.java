package question3;

import java.io.File;

/**
 * Suppose we are building a utility, where multiple threads are doing some calculations and they use large
 * values read from a file by a file reader class (there is a single file that has multiple values and each
 * thread will be working on exactly one value).The file reader class should be optimized for performance
 * and resource utilization along with thread safety so that no two threads are working on the same value.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        FileUtility instance1;
        FileUtility instance2;

        //thread 1 is setting the value of checker to 10
        Thread t1 = new Thread(() -> {
            FileUtility.getInstance().setChecker(10);
        });

        //thread 2 is getting instance and then getting value of checker
        //if new instance would have created then t would be printed 0;
        //if instance returned is created in thread 1 then t would be printed 10;
        Thread t2 = new Thread(() -> {
           int t =  FileUtility.getInstance().getChecker();
            System.out.println(t);
        });

        //if thread 2 starts before thread 1 then 0 would be printed.
        t1.start();
        t2.start();
    }
}
