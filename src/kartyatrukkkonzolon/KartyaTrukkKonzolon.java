package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukkKonzolon {

   private static String[] pakli = new String[22];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Pakli paklik = new Pakli();
        KartyaTrukkKonzolon jatek = new KartyaTrukkKonzolon();
       jatek.indit();
       
    }

  
    private static void indit() {
        Pakli paklik = new Pakli();
        for (int i = 0; i < 3; i++) {
            paklik.kirak();
            int oszlop = melyik();
            paklik.kever(oszlop);           
            
            //kever(oszlop);
        }
        paklik.eVolt();
        //ezVolt();

    }
     private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    }


