package BehavioralDesignPattern.strategy;

public class Phonepe implements WalletStrategy{


    @Override
    public void pay(int amount) {
        System.out.println("Paying via phone pe " + amount);
    }
}
