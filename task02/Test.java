package selfwork15.task02;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        String[] array = new String[40_000_000];
        long start = System.currentTimeMillis();

       WriterArray write = new WriterArray(0,5_000_000,array);
       WriterArray write1 = new WriterArray(5_000_000,10_000_000,array);
       WriterArray write2 = new WriterArray(5_000_000,15_000_000,array);
       WriterArray write3 = new WriterArray(15_000_000,20_000_000,array);

        Thread thread = new Thread(write);
        Thread thread1 = new Thread(write1);
        Thread thread2 = new Thread(write2);
        Thread tread3 = new Thread(write3);

        thread.start();
        thread1.start();
        thread2.start();
        tread3.start();

        thread.join();
        thread1.join();
        thread2.join();
        tread3.join();
        long stop = System.currentTimeMillis();
        System.out.println("Time with 4 tread: " + (stop-start));

        long start1 = System.currentTimeMillis();
        WriterArray write5 = new WriterArray(0,20_000_000,array);

        Thread thread5 = new Thread(write5);
        thread5.start();
        thread5.join();

        long stop1 = System.currentTimeMillis();
        System.out.println("Time with 1 tread: " + (stop1-start1));
    }
}
