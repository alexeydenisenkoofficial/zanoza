import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger totalSum=new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        ArrayList<Thread> threads = new ArrayList<>();

        for(int i=1;i<11;i++){
            work(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Итоговое время: "+ (endTime-startTime));

        startTime=System.currentTimeMillis();

        for (int i = 1; i < 11; i++){
            final int localI = i;
            Thread thread = new Thread(()->work(localI));
            thread.start();
            threads.add(thread);

        }

        for(Thread t: threads){
            t.join();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Итоговое время: " + (endTime - startTime));
        System.out.println("Итоговая сумма: " + totalSum);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 300, 10_000_000);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count) {
        long temp = 0;
        for (int i = 0; i < count; i++) {
            temp+=Math.pow(i,start)/(start*start);
            totalSum.incrementAndGet();
        }
        return temp;
    }
}
