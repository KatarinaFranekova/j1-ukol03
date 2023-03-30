package cz.czechitas.ukol3;

import java.util.Objects;

public class Procesor {

    private String vyrobca;

    private long rychlost;

    public String getVyrobca() {
        return vyrobca;
    }

    public void setVyrobca (String vyrobca) {
        this.vyrobca = vyrobca;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    @Override
    public String toString() {
        return "Procesor - " + "vyrobca " + vyrobca + '/' + "rychlost" +rychlost;

    }
}
