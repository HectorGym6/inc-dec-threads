package org.example;

public class IncrementTask implements Runnable {
    private final Counter counter;

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while(counter.getValue() != 0) {
            counter.increment();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
