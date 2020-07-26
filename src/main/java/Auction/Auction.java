package Auction;


import java.util.ArrayList;

public class Auction implements Subject {
    private String auctionItemId;
    private ArrayList<Observer> observers = new ArrayList<>();
    private String productName;
    private double bidAmount;

    private Observer observer;

    private double currentBid = 0.00;
    private double reservePrice;
    private Item item;


    public Auction(String productName, double bidAmount) {
        this.productName = productName;
        this.bidAmount = bidAmount;
        this.reservePrice= bidAmount;
    }

    @Override
    public void setBidAmount(Observer observer, double newBidAmount) {
        int res;
//        =bidAmount.compareTo(newBidAmount);
        if (this.bidAmount < newBidAmount) {
            res = -1;
        } else if (this.bidAmount == newBidAmount) {
            res = 0;
        } else
            res = 1;

        if (res == -1) {
            this.observer = observer;
            this.bidAmount = newBidAmount;
            notifyObservers();
        } else {
            System.out.println("New bid amount cannot be less or equal to current bid amount: " + this.bidAmount);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("-----------------" + observer + " has withdrawn from bidding----------------");
    }

    @Override
    public void notifyObservers() {
        System.out.println("-----------------New bid placed----------------");
        for (Observer ob : observers) {
            ob.update(this.observer, this.productName, this.bidAmount);
        }
    }
}