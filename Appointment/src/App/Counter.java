package App;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    private final int id;

    public Counter() {
        id = COUNTER.getAndIncrement();
    }

    public int getId() {
        return id;
    }
}



