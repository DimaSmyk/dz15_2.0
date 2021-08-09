package selfwork15.task02;

public class WriterArray implements Runnable {

    int startIndex;
    int end;
    String[] array;

    public WriterArray(int startIndex, int end, String[] array) {
        this.startIndex = startIndex;
        this.end = end;
        this.array = array;
    }

    @Override
    public void run() {

        for (int i = startIndex; i < end; i++) {

            if (i % 5 == 0 && i % 3 == 0) {
                array[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                array[i] = "Fizz";
            } else if (i % 5 == 0) {
                array[i] = "Buzz";
            } else {
                array[i] = String.valueOf(i);
            }

        }
    }
}
