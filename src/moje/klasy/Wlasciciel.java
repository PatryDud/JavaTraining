package moje.klasy;

import java.util.Scanner;
//zadanie 2
public class Wlasciciel {
    public static void main(String [] args)
    {
        Zwierze zwierzak = new Zwierze("Doggo");
        System.out.println(zwierzak);

        //zad 3c
        zmienZwierze(zwierzak);
        System.out.println("powrot do funkcji main" + zwierzak);

        //zad3d
        zmienImie(zwierzak);
        System.out.println("powrot do funkcji main" + zwierzak);
//zad 4
Zwierze zwierzak2= new Zwierze("koko");
Zwierze zwierzak3 =new Zwierze("roko");
Zwierze zwierzak4 = new Zwierze("loko");
Zwierze [] schronisko = {zwierzak2, zwierzak3, zwierzak4};
for(Zwierze x:schronisko){
System.out.println(x);}
// zad 5
Pies pies1 = new Pies("Kuki");
System.out.println(pies1);
pies1.dajLape();
pies1.szczekaj();

pies1.bawSie(4.0);
pies1.jedz(4.0);
pies1.spij(4.0);
System.out.println("zadanie 7 " + pies1);

//pola z modyfikatorami dostępu public lub domyślnym są dostępne dla metod z innych klas w tym pochodnych

Kot kotek = new Kot("Kici");
FunkcjeZyciowe funkcje =null;
funkcje=kotek;
funkcje.bawSie(5.0);
funkcje.jedz(5.0);
funkcje.pij(5.0);
funkcje.spij(5.0);
System.out.println("zadanie 7 " + kotek);
        FunkcjeZyciowe f = new Kot("kotek");
        f.bawSie(7.0);
        f.spij(7.0);
        f.pij(7.0);
        f.jedz(7.0);
        System.out.println(f);

        funkcje=pies1;
        funkcje.bawSie(5.0);
        funkcje.jedz(5.0);
        funkcje.pij(5.0);
        funkcje.spij(5.0);
        System.out.println("zadanie 7" + funkcje);



        try{
            pies1.jedz(5.0*pies1.WSPOLCZYNNIK_GLODU);
            pies1.pij(5.0*pies1.WSPOLCZYNNIK_PRAGNIENIA);
            pies1.spij(5.0*pies1.WSPOLCZYNNIK_ZMECZENIA);
            System.out.println(pies1);
            pies1.zdechPies();
            System.out.println(pies1);

        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println("pies nie zna jeszcze wszystkich sztuczek");
        }


         }



     //zad 3a
    public static void zmienZwierze(Zwierze zwierze)
    {
        Zwierze zwierze1 = new Zwierze("Gogo");
        zwierze=zwierze1;
        System.out.println("funkcja zmienZwierze sie wykonuje "+ zwierze);
    }
    //zad 3b
    public static void zmienImie(Zwierze zwierze)
    {
    zwierze.ustawImie("Wasyl");
        System.out.println("funkcja zmienzwierze w dziala "+ zwierze);

    }

    }


