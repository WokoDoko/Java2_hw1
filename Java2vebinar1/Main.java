package geekbrains.Java2vebinar1;

import geekbrains.Java2vebinar1.obstacles.Treadmill;
import geekbrains.Java2vebinar1.obstacles.Wall;
import geekbrains.Java2vebinar1.participants.*;


public class Main {
// Есть ли в Java возможность установить округление всех выводимых значений из класса до n-ных? Т.е. установить единый формат округления для класса.
// Спрашиваю, потому что в каждом sout приходилось отдельно прописывать %.2f (округление до сотых).
// Искал в интернете, но там везде пишут о том, как округлить отдельно взятые значения.

    public static void main(String[] args) {
        Treadmill treadmill1 = new Treadmill(200);

        Treadmill treadmills [] = new Treadmill[3];
        treadmills[0] = new Treadmill(300);
        treadmills[1] = new Treadmill(100);
        treadmills[2] = new Treadmill(100);

        Wall walls [] = new Wall[3];
        walls[0] = new Wall(300);
        walls[1] = new Wall(100);
        walls[2] = new Wall(100);

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

        Robot b50 = new Robot("B50", 5000, 100);

        for (int i = 0; i< treadmills.length; i++) {
            b50.run(treadmills[i]);
        }

    }
}
