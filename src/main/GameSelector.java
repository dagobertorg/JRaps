package main;

import games.AnySeven;
import games.FieldBet;
import games.PassLine;

import java.util.Scanner;

/**
 * Created by dramirez on 2016-10-11.
 */
public class GameSelector {
    public void select(){
        int selection = 0;
        //This present a player the game to select
        /*The do while loop allow us to validate the selection and it will run until the player does
        a valid selection*/
        do {
            System.out.println("Select a game to play");
            System.out.println("Press 1 for PassLine");
            System.out.println("Press 2 for FieldBet");
            System.out.println("Press 3 for Any7");
            Scanner myGame = new Scanner(System.in);

            if (myGame.hasNextInt()) {
                selection = myGame.nextInt();
                if (selection == 1) {
                    PassLine pl = new PassLine();
                    pl.perform();
                } else if (selection == 2) {
                    FieldBet fb = new FieldBet();
                    fb.perform();
                } else if (selection == 3) {
                    AnySeven any7 = new AnySeven();
                    any7.perform();
                } else {
                    System.out.println("invalid selection, please try again");
                }
            }else{
                System.out.println("invalid selection, please try again");
            }
        }
        while (selection < 0 || selection > 3);

    }
}
