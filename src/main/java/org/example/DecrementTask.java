package org.example;

public class DecrementTask implements Runnable{
    private final Counter counter;

    public DecrementTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while(counter.getValue() != 0) {
            counter.decrement();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
