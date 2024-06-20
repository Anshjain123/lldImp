package BehavioralDesignPattern.strategy;

public class TestStrategy {
    public static void main(String[] args) {

        Product product = new Product("Phone",4855);

        AmazonCart cart = new AmazonCart(new GooglePay(), product);

        cart.pay();
    }
}
