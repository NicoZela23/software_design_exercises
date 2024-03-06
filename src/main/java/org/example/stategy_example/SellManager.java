package org.example.stategy_example;

public class SellManager{
    private SellStrategy strategy;

    public void setStrategy(SellStrategy strategy) {
        this.strategy = strategy;
    }

    public int processPurchase(ItemDTO item, int quantity){
        return strategy.sell(item, quantity);
    }
}
