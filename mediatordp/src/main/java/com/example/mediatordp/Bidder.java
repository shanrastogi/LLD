package com.example.mediatordp;

public class Bidder implements Colleague {
    private String name;
    private AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        System.out.println(name + " is placing a bid of " + bidAmount);
        mediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(int bidAmount) {
        System.out.println(name + " has been notified of a new bid: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
