package com.example.mediatordp;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveNotification(int bidAmount);

    String getName();
}
