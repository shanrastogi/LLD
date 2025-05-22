package com.example.visitordp;

public class Main {
    public static void main(String[] args) {
        IRoomElement singleRoom = new SingleRoom();
        IRoomElement doubleRoom = new DoubleRoom();
        IRoomElement deluxeRoom = new DeluxeRoom();

        IRoomVisitor roomPricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(roomPricingVisitor);
        doubleRoom.accept(roomPricingVisitor);
        deluxeRoom.accept(roomPricingVisitor);

        IRoomVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(roomMaintenanceVisitor);
        doubleRoom.accept(roomMaintenanceVisitor);
        deluxeRoom.accept(roomMaintenanceVisitor);
    }
}