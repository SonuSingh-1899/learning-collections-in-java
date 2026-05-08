package List;

import java.util.Vector;


// this is how to vector thread safe and there was if we use linklist or arraylist then the output will be changed:
public class VectorThreadsafeExample {

    static Vector<Integer> vector = new Vector<>();
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                vector.add(i);
                count++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 500; i < 1000; i++) {
                vector.add(i);
                count++;
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Vector Size: " + vector.size());
        System.out.println("Count: " + count);
    }
}