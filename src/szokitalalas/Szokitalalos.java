package szokitalalas;

import java.util.Random;
import java.util.Scanner;

public class Szokitalalos {

    public static Random r = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static String kivalaszt() {
        String[] szavak = {"tó", "ló", "só", "kő", "él", "öl", "fa", "ez", "íz", "az", "őz", "te", "tű", "ül", "fű", "én", "ön", "uj", "új", "éj", "ék", "ét", "nő", "ti", "ki", "sí", "ér"};
        int index = r.nextInt(szavak.length);
        return szavak[index];
    }

    public static String tip_be() {
        System.out.print("Adj meg egy két betűs szót: ");
        String tip = sc.nextLine();
        return tip;
    }

    public static void eredmeny(String tip, String szo) {
        if(tip == szo)
            System.out.println("Kitaláltad!");
        else if(tip.charAt(0) == szo.charAt(0) || tip.charAt(1) == szo.charAt(1))
            System.out.println("Az egyik betű jó, és jó helyen van.");
        else if(tip.charAt(0) == szo.charAt(1) || tip.charAt(1) == szo.charAt(0))
            System.out.println("Az egyik betű jó, de nem jó helyen van.");
        else
            System.out.println("Nem jó szó.");
    }

    public static void main(String[] args) {
        String szo = kivalaszt();
        String tip;
        do {
            tip = tip_be();
            eredmeny(tip, szo);
        } while(tip != szo);

    }
    
}
