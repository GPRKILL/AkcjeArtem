package trader;

import exchange.Stock;
import exchange.StockExchange;

public class Trader {
    private String name;
    private StockExchange stockExchange;

    public Trader(String name, StockExchange stockExchange) {
        this.name = name;
        this.stockExchange = stockExchange;
    }

    public void buyStock() {
        Stock stock = stockExchange.getStock();
        System.out.println(name + " kupuje akcje " + stock.getSymbol());
    }

    public void sellStock() {
        Stock stock = stockExchange.getStock();
        System.out.println(name + " sprzedaje akcje " + stock.getSymbol());
    }
}