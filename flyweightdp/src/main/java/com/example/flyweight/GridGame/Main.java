package com.example.flyweight.GridGame;

public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RobotFactory.createRobot("Humanoid");
        humanoidRobot1.display(10, 20);

        IRobot roboticDog1 = RobotFactory.createRobot("Dog");
        roboticDog1.display(50, 60);

        IRobot humanoidRobot2 = RobotFactory.createRobot("Humanoid");
        humanoidRobot2.display(30, 40);

        IRobot roboticDog2 = RobotFactory.createRobot("Dog");
        roboticDog2.display(70, 80);
    }
}
