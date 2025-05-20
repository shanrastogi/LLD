package com.example.flyweight.GridGame;

public class HumanoidRobot implements IRobot {
    private Sprites humanoidSprite;
    private String type;

    public HumanoidRobot(Sprites humanoidSprite, String type) {
        this.humanoidSprite = humanoidSprite;
        this.type = type;
    }

    public Sprites getHumanoidSprite() {
        return humanoidSprite;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Humanoid Robot is at position (" + x + ", " + y + ")");
    }

}
