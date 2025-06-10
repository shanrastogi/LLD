package com.example.elevator;

import java.util.List;

public class InternalDispatcher {
    List<ElevatorController> controllers = ElevatorCreator.elevatorControllers;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar) {
        for (ElevatorController controller : controllers) {
            if (controller.elevatorCar.equals(elevatorCar)) {
                controller.submitInternalRequest(floor);
                return;
            }
        }
        throw new IllegalArgumentException("Elevator car not found.");
    }
}
