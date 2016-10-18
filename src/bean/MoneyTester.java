package bean;

import bean.Bankroll;

/**
 * Created by dramirez on 2016-10-10.
 */
public class MoneyTester {
    public void perform() {
        Bankroll bank1 = new Bankroll();
        bank1.setMoney(100);


        Bankroll bank2 = new Bankroll();
        bank2.setMoney(200);

        System.out.println("BankOneValue1: " + bank1.add(10));
        System.out.println("BankOneValue2: " + bank1.substract(20));
        System.out.println("BankTwoValue1: " + bank2.getMoney());
        System.out.println("BankTwoValue2: " + bank2.getFormattedMoney());


    }
}
