package geekbrains.Java2vebinar1;

import geekbrains.Java2vebinar1.obstacles.Treadmill;
import geekbrains.Java2vebinar1.obstacles.Wall;
import geekbrains.Java2vebinar1.participants.*;


public class Main {


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

        Human vasya = new Human("Vasya", 500, 500);
        vasya.jump(walls[0]);
        vasya.jump(walls[1]);
        vasya.jump(walls[2]);

        for (int i = 0; i< treadmills.length; i++) {
            vasya.run(treadmills[i]);
        }

        vasya.run(100);



    }
}
