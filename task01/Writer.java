package selfwork15.task01;

import java.util.List;

public class Writer implements Runnable{

    List<Integer> list;

    public Writer(List<Integer> list) {
        this.list = list;
    }
    @Override
    public void run() {

        int count = 0;
        while (count == 0){
            list.add((int) (Math.random() * 20));
            try {
                Thread.sleep(2_500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
