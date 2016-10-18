package bean;

import java.util.Scanner;

/**
 * Created by dramirez on 2016-10-11.
 */
public class AnySeven {
    public void perform(){
        System.out.println("Enter the amount to bet: ");
        Scanner sc = new Scanner(System.in);

        Bankroll amount = new Bankroll();
        amount.setMoney(sc.nextDouble());

        TheDie die1 = new TheDie(100);
        System.out.println("die one:" + die1.rollTheDie());

        TheDie die2 = new TheDie(100);
        System.out.println("die two:" + die2.rollTheDie());

        int dice = die1.getOneDie() + die2.getOneDie();
        System.out.println("total: " + dice);

        Bankroll won = new Bankroll();

        if(dice == 7){
            System.out.println("You won: " + (amount.getMoney() * 4));
        }else{
            System.out.println("You lose!");
        }
    }
}
