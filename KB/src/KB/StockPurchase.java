package KB;

public class StockPurchase {

    // Attributes
    private String stock;
    private int shares;
    private int SharePrice;
    private int cost;

    // Constructors
    public StockPurchase(String stock, int shares, int sharePrice, int cost) {
        this.stock = stock;
        this.shares = shares;
        SharePrice = sharePrice;
    }
    // Getters
    public String getStock() {
        return stock;
    }
    public int getShares() {
        return shares;
    }
    public int getSharePrice() {
        return SharePrice;
    }
    public String getCost() {
        return  stock + " is " + (SharePrice * shares);
    }

    // Setters
    public void setStock(String stock) {
        this.stock = stock;
    }
    public void setShares(int shares) {
        this.shares = shares;
    }
    public void setSharePrice(int sharePrice) {
        SharePrice = sharePrice;
    }
}

class RunStockPurchase{
    public static void main(String[] args){
        StockPurchase stockpurchase1 = new StockPurchase("Debswana", 40, 40, 40 * 40);
        System.out.println("The cost of " + stockpurchase1.getCost());
    }
}