package geekbrains.Java2vebinar1.methods;

import geekbrains.Java2vebinar1.obstacles.Treadmill;

public interface Run {

    void run (double distance);
    default void run (Treadmill treadmill) {

    }
}
