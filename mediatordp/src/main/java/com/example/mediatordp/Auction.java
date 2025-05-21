package com.example.mediatordp;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    private List<Colleague> bidders;

    public Auction() {
        bidders = new ArrayList<>();
    }

    @Override
    public void addBidder(Colleague bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for (Colleague b : bidders) {
            if (!(b.getName().equals(bidder.getName()))) {
                b.receiveNotification(bidAmount);
            }
        }
    }

}
