package com.may16.practices.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class AuctionItem {
    private String itemName;
    private String description;
    private double highestBid;
    private String bidder;

    public AuctionItem(String itemName, String description) {
        this.itemName = itemName;
        this.description = description;
        this.highestBid = 0.0;
        this.bidder = null;
    }

    public String getItemName() {
        return itemName;
    }

    public String getDescription() {
        return description;
    }

    public double getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(double highestBid, String bidder) {
        this.highestBid = highestBid;
        this.bidder = bidder;
    }

    public String getBidder() {
        return bidder;
    }
}

class AuctionPlatform {
    private Map<String, AuctionItem> auctionItems;
    private Map<String, Set<String>> userBids;

    public AuctionPlatform() {
        this.auctionItems = new HashMap<>();
        this.userBids = new HashMap<>();
    }

    public void addItem(String itemID, String itemName, String description) {
        auctionItems.put(itemID, new AuctionItem(itemName, description));
    }
//    platform.placeBid("user1", "1", 500);
//    platform.placeBid("user2", "1", 600);
//    platform.placeBid("user3", "2", 2000);
//    platform.placeBid("user1", "2", 2500);
    

    public void placeBid(String userID, String itemID, double bidAmount) {
        if (auctionItems.containsKey(itemID)) {
            AuctionItem item = auctionItems.get(itemID);
            if (bidAmount > item.getHighestBid()) {
                item.setHighestBid(bidAmount, userID);
                userBids.computeIfAbsent(userID, k -> new HashSet<>()).add(itemID);
            }
        }
    }
    public double getHighestBid(String itemID) {
        return auctionItems.getOrDefault(itemID, new AuctionItem("", "")).getHighestBid();
    }

    public List<String> getBidsForItem(String itemID) {
        AuctionItem item = auctionItems.getOrDefault(itemID, new AuctionItem("", ""));
        List<String> bids = new ArrayList<>();
        if (item.getHighestBid() > 0) {
            bids.add(item.getBidder() + " bid " + item.getHighestBid());
        }
        return bids;
    }

    public List<String> getUserBids(String userID) {
        return new ArrayList<>(userBids.getOrDefault(userID, Collections.emptySet()));
    }

    public List<String> getItemsWithNoBids() {
        return auctionItems.entrySet().stream()
                .filter(entry -> entry.getValue().getHighestBid() == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<String> getItemsWithBidsAbove(double amount) {
        return auctionItems.entrySet().stream()
                .filter(entry -> entry.getValue().getHighestBid() > amount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {
        AuctionPlatform platform = new AuctionPlatform();

        platform.addItem("1", "Watch", "Luxury wristwatch");
        platform.addItem("2", "Painting", "Famous artwork");

        platform.placeBid("user1", "1", 500);
        platform.placeBid("user2", "1", 600);
        platform.placeBid("user3", "2", 2000);
        platform.placeBid("user1", "2", 2500);

        System.out.println("Highest bid for item 1: $" + platform.getHighestBid("1"));
        
        System.out.println("Bids for item 1: " + platform.getBidsForItem("1"));
        System.out.println("Bids for item 2: " + platform.getBidsForItem("2"));


        System.out.println("Bids for user1: " + platform.getUserBids("user1"));
        System.out.println("Bids for user2: " + platform.getUserBids("user2"));
        System.out.println("Bids for user3: " + platform.getUserBids("user3"));


        System.out.println("Items with no bids: " + platform.getItemsWithNoBids());

        System.out.println("Items with bids above $1000: " + platform.getItemsWithBidsAbove(1000));
    }
}

