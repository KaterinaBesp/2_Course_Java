package Lesson1.action;

public class Robots implements Action {
    private int maxRun;
    private int maxJump;

    public Robots(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robots() {
        this(2000, 10);
    }

    public boolean run(int dist) {
        if (dist <= this.maxRun) {
            System.out.println("Робот пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Робот не пробежал " + dist + "м");
            return false;
        }
    }

    public boolean jump(int dist) {
        if (dist <= this.maxJump) {
            System.out.println("Робот перепрыгнул " + dist + "м");
            return true;
        } else {
            System.out.println("Робот не перепрыгнул" + dist + "м");
            return false;
        }
    }
}
