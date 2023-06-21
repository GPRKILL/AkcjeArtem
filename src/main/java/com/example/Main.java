package com.example;

import exchange.Stock;
import exchange.StockExchange;
import trader.Trader;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Apple", 150.25);
        StockExchange stockExchange = new StockExchange(stock);
        Trader trader = new Trader("John", stockExchange);

        trader.buyStock();
        trader.sellStock();
        stock.updatePrice(155.50);
        trader.buyStock();
        trader.sellStock();
        stock.updatePrice(185.30);
    }
}