package com.example.flyweight.GridGame;

public class RoboticDog implements IRobot {
    private Sprites roboticDogSprite;
    private String type;

    public RoboticDog(Sprites roboticDogSprite, String type) {
        this.roboticDogSprite = roboticDogSprite;
        this.type = type;
    }

    public Sprites getRoboticDogSprite() {
        return roboticDogSprite;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Robotic Dog is at position (" + x + ", " + y + ")");
    }

}
