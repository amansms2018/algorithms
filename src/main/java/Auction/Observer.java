package Auction;

import java.math.BigDecimal;

public interface Observer {
    public void update(Observer observer,String productName, double bidAmount);
  }