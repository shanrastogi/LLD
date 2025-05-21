package com.example.mediatordp;

public class Main {
    public static void main(String[] args) {
        // Create the auction mediator
        Auction auction = new Auction();

        // Create bidders
        Colleague bidder1 = new Bidder("Bidder 1", auction);
        Colleague bidder2 = new Bidder("Bidder 2", auction);
        Colleague bidder3 = new Bidder("Bidder 3", auction);

        // Bidders place bids
        bidder1.placeBid(100);
        bidder2.placeBid(150);
        bidder3.placeBid(120);
    }
}