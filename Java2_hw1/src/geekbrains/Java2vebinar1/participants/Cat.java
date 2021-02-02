package geekbrains.Java2vebinar1.participants;

import geekbrains.Java2vebinar1.methods.RunAndJump;
import geekbrains.Java2vebinar1.obstacles.Treadmill;
import geekbrains.Java2vebinar1.obstacles.Wall;

public class Cat implements RunAndJump {



    @Override
    public void jump(Wall wall) {
        System.out.printf("Cat jumps %s");
    }

    @Override
    public void run(double distance) {
        System.out.printf("Cat runs %s");
    }
}
