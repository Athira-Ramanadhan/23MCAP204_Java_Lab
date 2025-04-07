// Class to generate Fibonacci numbers
class FibonacciThread extends Thread {
    private int count;

    public FibonacciThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (count > 1) System.out.print(b + " ");
        for (int i = 2; i < count; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
}

// Class to display even numbers in a given range
class EvenNumberThread extends Thread {
    private int start;
    private int end;

    public EvenNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even Numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

// Main class to run both threads
public class Threaddemo {
    public static void main(String[] args) {
        FibonacciThread fibThread = new FibonacciThread(10);  // Generate 10 Fibonacci numbers
        EvenNumberThread evenThread = new EvenNumberThread(1, 20);  // Even numbers from 1 to 20

        fibThread.start(); // Start Fibonacci thread
        evenThread.start(); // Start Even Number thread
    }
}
