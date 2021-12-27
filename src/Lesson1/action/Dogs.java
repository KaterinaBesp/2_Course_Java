package Lesson1.action;

public class Dogs implements Action {
    private int maxRun;
    private int maxJump;


    public Dogs(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Dogs() {
        this(1000, 1);
    }

    public boolean run(int dist) {
        if (dist <= this.maxRun) {
            System.out.println("Cобака пробежала " + dist + "м");
            return true;
        } else {
            System.out.println("Cобака не пробежала " + dist + "м");
            return false;
        }
    }

    public boolean jump(int dist) {
        if (dist <= this.maxJump) {
            System.out.println("Cобака перепрыгнула " + dist + "м");
            return true;
        } else {
            System.out.println("Cобака не перепрыгнула " + dist + "м");
            return false;
        }
    }
}
