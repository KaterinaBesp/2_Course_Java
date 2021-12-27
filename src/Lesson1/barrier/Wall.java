package Lesson1.barrier;

import Lesson1.action.Action;

public class Wall implements Barrier {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    public boolean doIt(Action c) {
        return c.jump(this.heigth);
    }
}