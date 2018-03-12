package moje.klasy;
//zadanie 2
public class Zwierze {

    private String imie;

    //zad 7
    private Double glod ;
    private Double pragnienie;
    private Double zmeczenie;



    public Zwierze(String imie2){
        imie = imie2;
        this.glod = 0.0;
        this.pragnienie = 0.0;
        this.zmeczenie = 0.0;

    }
    public Double getGlod()
    {
        return glod;
    }

    public Double getPragnienie()
    {
        return pragnienie;
    }

    public Double getZmeczenie()
    {
        return zmeczenie;
    }

    public void setGlod(Double glod)
    {
        this.glod=glod;
    }

    public void setZmeczenie(Double zmeczenie)
    {
        this.zmeczenie=zmeczenie;
    }
    public void setPragnienie(Double pragnienie)
    {
        this.pragnienie=pragnienie;
    }

    public void ustawImie(String imie)
    {
    this.imie=imie;
    }

    public String toString(){
//zad7
        return dajRodzajZwierzecia()+imie+glod+pragnienie+zmeczenie ;
    }
//zad 6
    public String dajRodzajZwierzecia()
    {
        return "Zwierzatko: ";
    }
}
