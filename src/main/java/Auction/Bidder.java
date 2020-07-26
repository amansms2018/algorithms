package Auction;

public class Bidder implements Observer{
   private String bidderName;
    private  double maxAutoBidAmount;

    public Bidder(String bidderName) {
        this.bidderName = bidderName;
    }
    @Override
    public void update(Observer observer,String productName, double bidAmount){
        if(observer.toString().equals(bidderName)){
            System.out.println("Hello "+bidderName+"! New bid of amount "+bidAmount+" has been placed on "+productName+" by you");
        }
        if(!observer.toString().equals(bidderName)) {
            System.out.println("Hello " + bidderName + "! New bid of amount " + bidAmount + " has been placed on " + productName + " by " + observer);
        }
    }
    @Override
    public String toString(){
        return bidderName;
    }
}