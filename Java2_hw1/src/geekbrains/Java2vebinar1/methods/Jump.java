package geekbrains.Java2vebinar1.methods;

import geekbrains.Java2vebinar1.obstacles.Wall;

public interface Jump {

    void jump (Wall wall);
    default void jump (double distance) {

    };

}
