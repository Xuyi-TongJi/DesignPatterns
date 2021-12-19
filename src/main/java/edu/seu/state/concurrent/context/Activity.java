package edu.seu.state.concurrent.context;

import java.util.concurrent.atomic.AtomicInteger;

public class Activity {
    private final AtomicInteger count;

    public Activity(Integer count) {
        this.count = new AtomicInteger(count);
    }

    public boolean getPrize() {
        return count.decrementAndGet() <= 0;
    }

    public int getCount() {
        return count.get();
    }
}
