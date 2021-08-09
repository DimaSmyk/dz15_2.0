package selfwork15.task01;

import java.util.Date;
import java.util.List;

public class Reader implements Runnable{

    List<Integer> list;


    public Reader(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {

        int count = 0;
        while (count == 0){
            if (list != null && list.isEmpty()) {
                Date date = new Date();
                System.out.println("The list is empty " + date);
            } else{
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                    list.clear();
                }
            }
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
