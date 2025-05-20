package com.example.flyweight.GridGame;

import java.util.HashMap;

public class RobotFactory {
    private static HashMap<String, IRobot> robotCache = new HashMap<>();

    public static IRobot createRobot(String robotType) {
        if (robotCache.containsKey(robotType)) {
            System.out.println("From cache");
            return robotCache.get(robotType);
        } else {
            IRobot robot = null;
            if (robotType.equalsIgnoreCase("HUMANOID")) {
                robot = new HumanoidRobot(new Sprites(), "HUMANOID");
                System.out.println("Newly created");
                robotCache.put(robotType, robot);
            } else if (robotType.equalsIgnoreCase("DOG")) {
                robot = new RoboticDog(new Sprites(), "DOG");
                System.out.println("Newly created");
                robotCache.put(robotType, robot);
            } else {
                System.out.println("Robot type not recognized.");
            }
            return robot;
        }
    }
}
