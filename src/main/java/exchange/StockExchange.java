package exchange;

public class StockExchange {
    private Stock stock;

    public StockExchange(Stock stock) {
        this.stock = stock;
    }

    public void displayStockPrice() {
        System.out.println("Cena akcji " + stock.getSymbol() + ": " + stock.getPrice());
    }

    public Stock getStock() {
        // Logic to retrieve a stock from the stock exchange
        Stock stock = new Stock("Apple",155.50); // Example stock creation
        return stock;
    }
}
