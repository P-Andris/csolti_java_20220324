package szokitalalas;

import java.util.Random;
import java.util.Scanner;

public class Szokitalalos {

    public static Random r = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static String kivalaszt() {
        String[] szavak = {"fa", "ez", "az", "te", "ti", "ki"};
        int index = r.nextInt(szavak.length);
        return szavak[index];
    }

    public static String tip_be() {
        System.out.print("Adj meg egy két betűs szót: ");
        String tip = sc.nextLine().toLowerCase();
        return tip;
    }

    public static int eredmeny(String tip, String szo, int t_num) {
        t_num++;
        if(tip.length() != 2)
            System.out.println("Nem jó szó.");
        else if(tip.charAt(0) == szo.charAt(0) && tip.charAt(1) == szo.charAt(1))
            System.out.println(t_num + " próbálkozásból kitaláltad!");
        else if(tip.charAt(0) == szo.charAt(0) || tip.charAt(1) == szo.charAt(1))
            System.out.println("Az egyik betű jó, és jó helyen van.");
        else if(tip.charAt(0) == szo.charAt(1) || tip.charAt(1) == szo.charAt(0))
            System.out.println("Az egyik betű jó, de nem jó helyen van.");
        else
            System.out.println("Nem jó szó.");
        return t_num;
    }

    public static void main(String[] args) {
        String szo = kivalaszt();
        String tip;
        int t_num = 0;
        do {
            tip = tip_be();
            t_num = eredmeny(tip, szo, t_num);
            //System.out.println(szo + " " + tip);
        } while(tip.length() != 2 || tip.charAt(0) != szo.charAt(0) || tip.charAt(1) != szo.charAt(1));

    }
    
}
