class Shared {
    int num;
    boolean isProduced = false;

    synchronized void produce(int n) throws InterruptedException {
        if (isProduced) wait();
        num = n;
        System.out.println("Produced: " + num);
        isProduced = true;
        notify();
    }

    synchronized void consume() throws InterruptedException {
        if (!isProduced) wait();
        System.out.println("Consumed: " + num);
        isProduced = false;
        notify();
    }
}

class Producer extends Thread {
    Shared s;
    Producer(Shared s) { this.s = s; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try { s.produce(i); } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread {
    Shared s;
    Consumer(Shared s) { this.s = s; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try { s.consume(); } catch (Exception e) {}
        }
    }
}

public class Producerdemo{
    public static void main(String[] args) {
        Shared s = new Shared();
        new Producer(s).start();
        new Consumer(s).start();
    }
}
