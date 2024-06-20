package BehavioralDesignPattern.strategy;

public class GooglePay implements WalletStrategy{


    @Override
    public void pay(int amount) {
        System.out.println("Paying via google pay " + amount);
    }
}
