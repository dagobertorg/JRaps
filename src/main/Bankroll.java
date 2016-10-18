package main;

import java.text.NumberFormat;

/**
 * Created by dramirez on 2016-10-10.
 */
public class Bankroll {
    private double money;

    public Bankroll() {
        money = 0;
    }

    public Bankroll(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double add(double amount){
        return money += amount;
    }

    public double substract(double amount){
        return money -= amount;
    }

    public String getFormattedMoney(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String myCurrency = currency.format(money);
        return myCurrency;
    }
}
