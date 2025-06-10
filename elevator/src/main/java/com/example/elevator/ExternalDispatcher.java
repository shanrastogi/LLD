package com.example.elevator;

import java.util.List;

public class ExternalDispatcher {
    List<ElevatorController> controllers = ElevatorCreator.elevatorControllers;

    public void submitExternalRequest(int floor, Direction direction) {
        for (ElevatorController controller : controllers) {
            int elevatorID = controller.elevatorCar.id;
            if (elevatorID % 2 == 1 && floor % 2 == 1) {
                controller.submitExternalRequest(floor, direction);
            } else if (elevatorID % 2 == 0 && floor % 2 == 0) {
                controller.submitExternalRequest(floor, direction);

            }

        }
        throw new IllegalArgumentException("No valid elevator found for the request.");
    }
}
