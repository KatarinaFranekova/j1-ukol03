package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");


            Pocitac mojPocitac;
            mojPocitac = new Pocitac();

            System.out.println(mojPocitac.toString());
            mojPocitac.zapniSa();      // Vypise chybu, protoze pocitac
            // nema vsechny povinne soucasti

            Procesor mojProcesor = new Procesor();
            mojProcesor.setRychlost(3_400_000_000_000L);
            mojProcesor.setVyrobca("Intel");

            Pamat mojaPamat = new Pamat();
            mojaPamat.setKapacita(16_000_000_000L);

            Disk mojDisk = new Disk();
            mojDisk.setKapacita(255_195_746_304L);

            mojPocitac.setCpu(mojProcesor);
            mojPocitac.setRam(mojaPamat);
            mojPocitac.setPevnyDisk(mojDisk);

            System.out.println(mojPocitac.toString());

            mojPocitac.zapniSa();
            mojPocitac.zapniSa();      // Vypise chybu, protoze pocitac uz bezi

        System.out.println(mojPocitac.toString());
            mojPocitac.vypniSa();

            mojPocitac.vypniSa();      // Nevypise chybu, ale nic neprovede,
            mojPocitac.vypniSa();      // protoze pocitac je uz vypnuty

        mojPocitac.vytvorSuborVelkosti(500);
        mojPocitac.vymazSuborVelkosti(600);


        }












    }

}
