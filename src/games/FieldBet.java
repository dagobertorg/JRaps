package games;

import main.Bankroll;
import main.TheDie;

import java.util.Scanner;

/**
 * Created by dramirez on 2016-10-11.
 */
public class FieldBet {
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

        if(dice == 3 || dice == 4 || dice == 9 || dice == 10 || dice == 11){
            System.out.println("You won: " +  amount.getMoney());
        } else if (dice == 2){

            System.out.println("You won: " + (amount.getMoney() * 2));
        } else if (dice == 12){
            System.out.println("You won: " + (amount.getMoney() * 3));
        }else{
            System.out.println("You lose");
        }
    }
}
