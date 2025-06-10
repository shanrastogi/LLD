package com.example.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {
    static List<ElevatorController> elevatorControllers = new ArrayList<>();
    static {
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.id = 1;
        ElevatorController controller1 = new ElevatorController(elevatorCar1);
        elevatorControllers.add(controller1);

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar2.id = 2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);
        elevatorControllers.add(controller2);

    }
}
