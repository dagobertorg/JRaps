package bean;

/**
 * Created by dramirez on 2016-10-10.
 */
public class DieTester {
    public void perform() {
        TheDie myDie = new TheDie(100);
        System.out.println(myDie.rollTheDie());
    }
}
