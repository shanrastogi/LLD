package com.example.elevator;

public class Floor {
    int floorNumber;
    ExternalButtons externalButtons;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.externalButtons = new ExternalButtons();
    }

    public void pressButton(Direction direction) {
        externalButtons.pressButton(floorNumber, direction);
    }
}
