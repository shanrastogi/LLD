package com.example.elevator;

public class ElevatorCar {
    int id;
    ElevatorDisplay display;
    InternalButtons internalButtons;
    ElevatorState state;
    Direction direction;
    ElevatorDoor door;
    int currentFloor;

    public ElevatorCar() {
        this.display = new ElevatorDisplay();
        this.internalButtons = new InternalButtons();
        this.state = ElevatorState.IDLE;
        this.direction = Direction.UP;
        this.door = new ElevatorDoor();
        this.currentFloor = 0; // Assuming ground floor is 0
    }

    public void showDisplay() {
        display.getDisplay();
    }

    public void pressButton(int destination) {
        internalButtons.pressButton(destination, this);
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor, direction);
    }

    boolean moveElevator(Direction direction, int destinationFloor) {
        int startFloor = currentFloor;
        if (direction == Direction.UP) {
            for (int i = startFloor; i <= destinationFloor; i++) {
                currentFloor = i;
                setDisplay();
                showDisplay();
                System.out.println("Moving up to floor: " + currentFloor);
                if (i == destinationFloor) {
                    door.openDoor();
                    state = ElevatorState.IDLE; // Elevator stops after reaching the destination
                    return true; // Successfully moved to the destination
                }
            }
        } else if (direction == Direction.DOWN) {
            for (int i = startFloor; i >= destinationFloor; i--) {
                currentFloor = i;
                setDisplay();
                showDisplay();
                System.out.println("Moving down to floor: " + currentFloor);
                if (i == destinationFloor) {
                    door.openDoor();
                    state = ElevatorState.IDLE; // Elevator stops after reaching the destination
                    return true; // Successfully moved to the destination
                }
            }
        }
        return false;
    }

}
