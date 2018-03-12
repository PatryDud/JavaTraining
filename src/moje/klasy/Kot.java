package moje.klasy;

public class Kot extends Zwierze implements FunkcjeZyciowe {
    public Kot(String imie2) {
        super(imie2);
    }

    public String dajRodzajZwierzecia(){
        return "Kot: ";
    }

    public Double jedz(Double iloscPozywienia){
        return getGlod() -iloscPozywienia;
    }

    @Override
    public Double pij(Double iloscWody) {
        return getPragnienie()-iloscWody;
    }

    @Override
    public Double spij(Double czas) {
        return getZmeczenie()-czas;
    }

    @Override
    public void bawSie(Double czas) {
        this.setGlod(czas*2);
        this.setPragnienie(czas*3);
        this.setZmeczenie(czas*4);

    }
}
