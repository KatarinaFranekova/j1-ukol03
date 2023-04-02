package cz.czechitas.ukol3;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamat ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {

        this.cpu = cpu;
    }

    public Pamat getRam() {
        return ram;
    }

    public void setRam(Pamat ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }


    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }

    public boolean jeZapnuty () {
        return jeZapnuty;
    }

    public void vypniSa() {
        if (jeZapnuty) {
            System.out.println("Pocitac sa vypina");
            jeZapnuty = false;
        }
        else {
            System.err.println("Pocitac uz je vypnuty");
        }
    }

    public void zapniSa() {
        if (jeZapnuty) {
            System.err.println("Pocitac uz je zapnuty");
        }
        else {
            if (this.ram == null || this.cpu == null || this.pevnyDisk == null) {
                System.out.println("Pocitac nie je mozne zapnut, musi obsahovat vsetky casti");
            }
            else {
                jeZapnuty = true;
                System.out.println("Pocitac sa zapina");
            }
        }
    }

    public void vytvorSuborVelkosti (long velkost) {
        if (jeZapnuty) {
            if (pevnyDisk.getVyuziteMisto() + velkost < pevnyDisk.getKapacita()) {
                System.out.println("Subor sa uklada");
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velkost);
            }
            else {
                System.err.println("Vyuzite misto je vacsie nez kapacita");
            }
            System.out.println("Pocitac je zapnuty");
        }
    }

    public void vymazSuborVelkosti (long velkost) {
        if (jeZapnuty) {
            if (pevnyDisk.getVyuziteMisto() - velkost > 0) {
                System.out.println("Subor sa uklada");
                pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velkost);
            }
            else {
                System.err.println("Vyuzite miesto je mensie nez nula");
            }
            System.out.println("Pocitac je zapnuty");
        }
    }



}
