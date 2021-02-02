package geekbrains.Java2vebinar1.participants;

import geekbrains.Java2vebinar1.methods.RunAndJump;
import geekbrains.Java2vebinar1.obstacles.Treadmill;
import geekbrains.Java2vebinar1.obstacles.Wall;

public class Human implements RunAndJump {

    private String name;
    private double jumpAbility;
    private double stamina;

    public Human (String name, double jumpAbility, double stamina) {
        this.name = name;
        this.jumpAbility = jumpAbility;
        this.stamina = stamina;
    }

    @Override
    public void jump(double height) {
        System.out.printf("%s jumps over %f meters", name, height);
    }

    @Override
    public void jump(Wall wall) {

        if (jumpAbility < wall.getHeight())
            setJumpAbility(0);

        while (jumpAbility >= wall.getHeight()){
            jumpAbility = jumpAbility - wall.getHeight();
            System.out.printf("%s overcomes the obstacle and has %f points of strengths left.\n", name, getJumpAbility());
            break;
        }

    }

    @Override
    public void run(double distance) {
        if (stamina<distance)
            System.out.printf("%s has not enough of stamina to run this distance.\n", getName());
        else {
        this.stamina = stamina - distance;
        System.out.printf("%s runs %f meters and has only %f stamina left.\n", name, distance,getStamina());}
    }

    @Override
    public void run(Treadmill treadmill) {
        if (stamina < treadmill.getLength())
            setStamina(0);

        while (stamina >= treadmill.getLength()){
            stamina = stamina - treadmill.getLength();
            System.out.printf("%s runs the treadmill and has %f points of stamina left.\n", name, getStamina());
            break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJumpAbility() {
        return jumpAbility;
    }

    public void setJumpAbility(double jumpAbility) {
        this.jumpAbility = jumpAbility;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }
}
