package selfwork15.task01;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();

        Reader reader = new Reader(list);
        Writer writer = new Writer(list);

        Thread thread = new Thread(writer);
        thread.start();

        Thread thread1 = new Thread(reader);
        thread1.start();
    }
}
