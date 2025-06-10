package com.example.elevator;

import java.util.PriorityQueue;

public class ElevatorController {
    // these are for LOOK algorithm
    PriorityQueue<Integer> upMinPq;
    PriorityQueue<Integer> downMaxPq;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
        this.upMinPq = new PriorityQueue<>();
        this.downMaxPq = new PriorityQueue<>((a, b) -> b - a);
    }

    public void submitExternalRequest(int floor, Direction direction) {
        if (direction == Direction.UP) {
            upMinPq.offer(floor);
        } else if (direction == Direction.DOWN) {
            downMaxPq.offer(floor);
        }
    }

    public void submitInternalRequest(int floor) {
        elevatorCar.pressButton(floor);
    }

    public void processRequests() {
        while (!upMinPq.isEmpty() || !downMaxPq.isEmpty()) {
            if (!upMinPq.isEmpty()) {
                int nextFloor = upMinPq.poll();
                elevatorCar.moveElevator(Direction.UP, nextFloor);
            }
            if (!downMaxPq.isEmpty()) {
                int nextFloor = downMaxPq.poll();
                elevatorCar.moveElevator(Direction.DOWN, nextFloor);
            }
        }
    }

}
