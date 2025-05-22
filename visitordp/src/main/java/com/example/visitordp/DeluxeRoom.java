package com.example.visitordp;

public class DeluxeRoom implements IRoomElement {
    public int roomPrice;

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visit(this);
    }
}
