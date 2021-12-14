package Lesson1.action;

public class Cats implements Action {

    private int maxRun;
    private int maxJump;

    public Cats(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cats() {
        this(600, 2);
    }

    public boolean run(int dist) {
        if (dist <= this.maxRun) {
            System.out.println("Кот пробежал " + dist + "м");
            return true;
        } else {
            System.out.println("Кот не пробежал " + dist + "м");
            return false;
        }
    }

    public boolean jump(int dist) {
        if (dist <= this.maxJump) {
            System.out.println("Кот перепрыгнул " + dist + "м");
            return true;
        } else {
            System.out.println("Кот не перепрыгнул" + dist + "м");
            return false;
        }
    }
}