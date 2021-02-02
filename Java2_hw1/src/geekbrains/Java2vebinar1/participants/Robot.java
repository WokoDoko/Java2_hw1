package geekbrains.Java2vebinar1.participants;

import geekbrains.Java2vebinar1.methods.RunAndJump;
import geekbrains.Java2vebinar1.obstacles.Treadmill;
import geekbrains.Java2vebinar1.obstacles.Wall;

public class Robot implements RunAndJump {

    @Override
    public void jump(Wall wall) {
        System.out.printf("Robot jumps %s");
    }

    @Override
    public void run(double distance) {
        System.out.printf("Robot runs %s");
    }
}
