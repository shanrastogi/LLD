package com.example.elevator;

public class ExternalButtons {
    ExternalDispatcher dispatcher;

    int[] availableFloors = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    void pressButton(int floor, Direction direction) {
        if (floor >= 1 && floor <= 10) {

            dispatcher.submitExternalRequest(floor, direction);
        } else {
            System.out.println("Invalid floor selected.");
        }
    }
}
