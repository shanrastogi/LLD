package com.example.visitordp;

public class RoomMaintenanceVisitor implements IRoomVisitor {
    @Override
    public void visit(IRoomElement roomElement) {
        if (roomElement instanceof SingleRoom) {
            SingleRoom singleRoom = (SingleRoom) roomElement;
            System.out.println("Performing maintenance on single room with price: " + singleRoom.roomPrice);
        } else if (roomElement instanceof DoubleRoom) {
            DoubleRoom doubleRoom = (DoubleRoom) roomElement;
            System.out.println("Performing maintenance on double room with price: " + doubleRoom.roomPrice);
        } else if (roomElement instanceof DeluxeRoom) {
            DeluxeRoom suiteRoom = (DeluxeRoom) roomElement;
            System.out.println("Performing maintenance on deluxe room with price: " + suiteRoom.roomPrice);
        } else {
            throw new IllegalArgumentException("Unknown room type");
        }
    }
}
