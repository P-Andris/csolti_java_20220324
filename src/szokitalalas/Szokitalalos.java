package szokitalalas;

import java.util.Random;
import java.util.Scanner;

public class Szokitalalos {

    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public static String kivalaszt() {
        String[] szavak = {"tó", "ló", "só", "kő", "él", "öl", "fa", "ez", "íz", "az", "őz", "te", "tű", "ül", "fű", "én", "ön", "uj", "új", "éj", "ék", "ét", "nő", "ti", "ki", "sí", "ér"};
        return szavak[0];
    }

    public static String tip_be() {
        String tip = "";
        return tip;
    }

    public static void eredmeny(String tip, String szo) {
        
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
