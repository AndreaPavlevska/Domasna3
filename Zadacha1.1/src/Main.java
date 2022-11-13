public class Main {
    public static void main(String[] args) {

        Fakultet f1 = new Fakultet();
        f1.nazivNaFakultet = "FIKT";
        f1.brojNaSmerovi = 5;
        f1.brojNaStudenti = 250;
        f1.dekan = "Pece Mitrevski";
        f1.sedishte = "Bitola";

        f1.prvMetod();
        System.out.println("Namalen broj studenti: " + f1.vtorMetod(50));
        f1.tretMetod();

        Fakultet f2 = new Fakultet();
        f2.nazivNaFakultet = "TBF";
        f2.brojNaSmerovi = 4;
        f2.brojNaStudenti = 300;
        f2.dekan = "Stojanche Nusev";
        f2.sedishte = "Bitola";

        f2.prvMetod();
        System.out.println("Namalen broj studenti: " + f2.vtorMetod(80));
        f2.tretMetod();

    }
}