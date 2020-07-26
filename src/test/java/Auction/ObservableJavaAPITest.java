package Auction;

import org.junit.jupiter.api.Test;

class ObservableJavaAPITest {
    @Test
    public void testObserver() throws Exception {
        Auction product = new Auction("L340 Digital Camera", 325);
        Bidder bidder1 = new Bidder("Shally Ferguson");
        Bidder bidder2 = new Bidder("Dwayne Bravo");
        Bidder bidder3 = new Bidder("Craig Dawson");
        product.registerObserver(bidder1);
        product.registerObserver(bidder2);
        product.registerObserver(bidder3);
        product.setBidAmount(bidder1, 300);
        product.registerObserver(bidder2);
        product.setBidAmount(bidder3, 37);
    }
}