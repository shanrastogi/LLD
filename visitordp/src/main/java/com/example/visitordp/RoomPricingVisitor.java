package com.example.visitordp;

public class RoomPricingVisitor implements IRoomVisitor {
    @Override
    public void visit(IRoomElement roomElement) {
        if (roomElement instanceof SingleRoom) {
            SingleRoom singleRoom = (SingleRoom) roomElement;
            singleRoom.roomPrice = 100; // Set price for Single Room
            System.out.println("Setting price for single room: " + singleRoom.roomPrice);
        } else if (roomElement instanceof DoubleRoom) {
            DoubleRoom doubleRoom = (DoubleRoom) roomElement;
            doubleRoom.roomPrice = 200; // Set price for Double Room
            System.out.println("Setting price for double room: " + doubleRoom.roomPrice);
        } else if (roomElement instanceof DeluxeRoom) {
            DeluxeRoom deluxeRoom = (DeluxeRoom) roomElement;
            deluxeRoom.roomPrice = 300; // Set price for Deluxe Room
            System.out.println("Setting price for deluxe room: " + deluxeRoom.roomPrice);
        } else {
            throw new IllegalArgumentException("Unknown room type");
        }
    }
}
