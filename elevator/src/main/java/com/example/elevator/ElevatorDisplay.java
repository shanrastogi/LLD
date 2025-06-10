package com.example.elevator;

public class ElevatorDisplay {
    int floor;
    Direction direction;

    public void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public String getDisplay() {
        if (direction == null) {
            return "Elevator is on floor " + floor + " and not moving.";
        }
        return "Elevator is on floor " + floor + " and moving " + direction.name().toLowerCase() + ".";
    }
}
