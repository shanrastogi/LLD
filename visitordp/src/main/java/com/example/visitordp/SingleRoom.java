package com.example.visitordp;

public class SingleRoom implements IRoomElement {
    public int roomPrice;

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visit(this);
    }
}
