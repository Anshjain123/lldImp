package BehavioralDesignPattern.strategy;

public class AmazonCart {

    private WalletStrategy walletStrategy;
    private Product product;

    public AmazonCart(WalletStrategy walletStrategy, Product product) {
        this.walletStrategy = walletStrategy;
        this.product = product;
    }

    public void pay() {
        this.walletStrategy.pay(product.getValue());
    }
}
