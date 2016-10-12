package bean;

import java.nio.channels.Pipe;
import java.util.Scanner;
import java.util.logging.SocketHandler;

/**
 * Created by dramirez on 2016-10-10.
 */
public class PassLine {
    public void perform() {

        //Here We start the program with a balance of 500
        Bankroll amount = new Bankroll();
        Bankroll balance = new Bankroll();
        balance.setMoney(500);
        System.out.println("You balance is: " + balance.getFormattedMoney());

        //We can continue playing while our balance is bigger that zero
        while (balance.getMoney() > 0.0) {

            /*We ask for the amount to bet and We check that We have that amount in our balance
            if not we ask again*/
            do {
                System.out.println("Enter the amount to bet: ");
                Scanner sc = new Scanner(System.in);
                amount.setMoney(sc.nextDouble());
            } while (amount.getMoney() >= balance.getMoney());

            //We roll the dice
            TheDie die1 = new TheDie(100);
            System.out.println("die one:" + die1.rollTheDie());

            TheDie die2 = new TheDie(100);
            System.out.println("die two:" + die2.rollTheDie());

            int dice = die1.getOneDie() + die2.getOneDie();
            System.out.println("total: " + dice);

            //We check the conditions of the game
            if (dice == 7 || dice == 11) {
                System.out.println("you win " + amount.getMoney());
                System.out.println("Your new balance is " + balance.add(amount.getMoney()));
            } else if (dice == 2 || dice == 3 || dice == 12) {
                System.out.println("you lose " + amount.getMoney());
                System.out.println("Your new balance is " + balance.substract(amount.getMoney()));
            } else {
                int newTotal;
                do {
                    System.out.println("hit enter to roll the dice again");
                    Scanner keyboard = new Scanner(System.in);
                    keyboard.nextLine();
                    System.out.println("die one:" + die1.rollTheDie());
                    System.out.println("die two:" + die2.rollTheDie());
                    newTotal = die1.getOneDie() + die2.getOneDie();
                    System.out.println("new total: " + newTotal);
                    if (newTotal == dice) {
                        System.out.println("you win " + amount.getMoney());
                        System.out.println("Your new balance is " + balance.add(amount.getMoney()));

                    } else if (newTotal == 7) {
                        System.out.println("you lose " + amount.getMoney());
                        System.out.println("Your new balance is " + balance.substract(amount.getMoney()));
                    }
                }
                while (newTotal != 7 || newTotal != dice);

            }
        }

    }
}
