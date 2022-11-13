public class Fakultet {

    public String nazivNaFakultet;
    public int brojNaSmerovi;
    public int brojNaStudenti;
    public String dekan;
    public String sedishte;

    public void prvMetod(){
        System.out.println("Zgolemen broj na studenti: " + this.brojNaStudenti);
    }
    public int vtorMetod(int namali){
        int namalenaVrednost = this.brojNaStudenti - namali;
        return namalenaVrednost;
    }
    public void tretMetod(){
        System.out.println("Naziv na fakultet: " + this.nazivNaFakultet);
    }
    }


