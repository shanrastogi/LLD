package com.example.elevator;

public class InternalButtons {
    InternalDispatcher dispatcher;

    int[] availableFloors = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int buttonSelected;

    void pressButton(int floor, ElevatorCar elevatorCar) {
        if (floor >= 1 && floor <= 10) {
            buttonSelected = floor;
            dispatcher.submitInternalRequest(floor, elevatorCar);
        } else {
            System.out.println("Invalid floor selected.");
        }
    }
}
