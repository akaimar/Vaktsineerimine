import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Peaklass {

    public static void main(String[] args) {

        // küsime kasutajalt sisendi
        Scanner sisend1 = new Scanner(System.in);
        Scanner sisend2 = new Scanner(System.in);

        String s1 ="astma";
        String s2 ="bronhiit";
        String s3 ="köha";
        HaigusteNimekiri.haigusteLoend.add(s1);
        HaigusteNimekiri.haigusteLoend.add(s2);
        HaigusteNimekiri.haigusteLoend.add(s3);

        System.out.println("Sisesta oma nimi: ");
        String kasutajaNimi = sisend1.nextLine();
        System.out.println("Tere " + kasutajaNimi);

        System.out.print("Milline krooniline haigus teil esineb: ");
        String kasutajaHaigus = sisend2.nextLine();

        Haigused väljundKlassistHaigus = new Haigused(kasutajaHaigus); // saadame klassi Haigused kasutaja poolt sisestatud haiguse

        System.out.println("Teie sisestasite " + kasutajaHaigus + ". Haigus" + väljundKlassistHaigus);

    }

}

