package main;

import java.util.Objects;
import java.util.Random;

/**
 * Created by dramirez on 2016-10-10.
 */
public class TheDie {
    private int oneDie;

    public TheDie(int oneDie) {
        this.oneDie = oneDie;
    }

    public int getOneDie() {
        return oneDie;
    }

    public int rollTheDie(){
        Random rand = new Random();
        oneDie =rand.nextInt(6) + 1;
        return oneDie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TheDie theDie = (TheDie) o;
        return oneDie == theDie.oneDie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneDie);
    }
}
