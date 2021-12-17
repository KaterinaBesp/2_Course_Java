import Lesson1.action.Action;
import Lesson1.action.Cats;
import Lesson1.action.Dogs;
import Lesson1.action.Robots;
import Lesson1.barrier.Barrier;
import Lesson1.barrier.Treadmill;
import Lesson1.barrier.Wall;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Action[] actions = new Action[]{new Cats(), new Dogs(), new Robots()};
        Barrier[] barriers = new Barrier[]{new Treadmill(600), new Wall(2)};
        Action[] var3 = actions;
        int var4 = actions.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            Action c = var3[var5];
            Barrier[] var7 = barriers;
            int var8 = barriers.length;

            for (int var9 = 0; var9 < var8; ++var9) {
                Barrier o = var7[var9];
                if (!o.doIt(c)) {
                    break;
                }
            }
        }

    }
}