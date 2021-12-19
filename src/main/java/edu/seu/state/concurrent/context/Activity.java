package edu.seu.state.concurrent.context;

public class Activity {
    private int count;

    public Activity(Integer count) {
        this.count = count;
    }

    public boolean getPrize() {
        return (--count) <= 0;
    }

    public int getCount() {
        return count;
    }
}
