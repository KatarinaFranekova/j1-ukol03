package cz.czechitas.ukol3;

import java.util.Objects;

public class Pamat {

    private long kapacita;

    public long getKapacita() {

        return kapacita;
    }
    public void setKapacita(long kapacita) {

        this.kapacita = kapacita;
    }


    @Override
    public String toString() {
        return "Pamat{" +
                "kapacita=" + kapacita +
                '}';
    }
}
