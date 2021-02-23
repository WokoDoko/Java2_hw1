package geekbrains.Java2vebinar1;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import geekbrains.Java2vebinar1.obstacles.Treadmill;
import geekbrains.Java2vebinar1.obstacles.Wall;
import geekbrains.Java2vebinar1.participants.*;


public class Main {
// Есть ли в Java возможность установить округление всех выводимых значений из класса до n-ных? Т.е. установить единый формат округления для класса.
// Спрашиваю, потому что в каждом sout приходилось отдельно прописывать %.2f (округление до сотых).
// Искал в интернете, но там везде пишут о том, как округлить отдельно взятые значения.

    public static void main(String[] args) {
        Treadmill treadmill1 = new Treadmill(200);

        Object treadmillsAndWalls [] = new Object[8];
        treadmillsAndWalls[0] = new Wall(100);
        treadmillsAndWalls[1] = new Wall(100);
        treadmillsAndWalls[2] = new Wall(100);
        treadmillsAndWalls[3] = new Wall(100);
        treadmillsAndWalls[4] = new Treadmill(100);
        treadmillsAndWalls[5] = new Treadmill(100);
        treadmillsAndWalls[6] = new Treadmill(100);
        treadmillsAndWalls[7] = new String("abc");


        /*Human vasya = new Human("Vasya", 500, 500);
        vasya.jump(walls[0]);
        vasya.jump(walls[1]);
        vasya.jump(walls[2]);

        for (int i = 0; i< treadmills.length; i++) {
            vasya.run(treadmills[i]);
        }
        vasya.run(100);*/

        /*Cat barsik = new Cat("Barsik", 250, 700);
        barsik.jump(walls[2]);

        for (int i = 0; i< walls.length; i++) {
            barsik.jump(walls[i]);
        }*/

        Robot b50 = new Robot("B50", 5000, 5000);

        for (int i = 0; i< treadmillsAndWalls.length; i++) {
            if (treadmillsAndWalls[i] instanceof Treadmill)
                b50.run(((Treadmill) treadmillsAndWalls[i]));

            else if (treadmillsAndWalls[i] instanceof Wall)
                    b50.jump(((Wall) treadmillsAndWalls[i]));
            else
                System.out.println("Undefined obstacle.");

        }

    }
}
