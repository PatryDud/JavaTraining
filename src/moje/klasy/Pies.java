package moje.klasy;
//zad 5
public class Pies extends Zwierze implements FunkcjeZyciowe{
    public final  int WSPOLCZYNNIK_GLODU=3;
    public final int WSPOLCZYNNIK_PRAGNIENIA=4;
    public final  int WSPOLCZYNNIK_ZMECZENIA = 2;


    public Pies(String imie2) {
        super(imie2);
    }
    public void szczekaj()
    {
        System.out.println("hau hau hau");
    }

    public void dajLape()
    {
        System.out.println("Daje lape");
    }
    //zad 6
    @Override
    public String dajRodzajZwierzecia(){
        return "Pies: ";
    }

    public Double jedz(Double iloscPozywienia){
return getGlod() - iloscPozywienia;

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
     this.setGlod(czas*WSPOLCZYNNIK_GLODU);
     this.setPragnienie(czas*WSPOLCZYNNIK_PRAGNIENIA);
     this.setZmeczenie(czas*WSPOLCZYNNIK_ZMECZENIA);

    }

public void zdechPies()
{
 throw new  UnsupportedOperationException("komunikat \n");
}


}
