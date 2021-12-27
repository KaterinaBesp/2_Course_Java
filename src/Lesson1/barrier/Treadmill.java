package Lesson1.barrier;

import Lesson1.action.Action;

public class Treadmill implements Barrier {
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    public boolean doIt(Action c) {
        return c.run(this.dist);
    }
}

