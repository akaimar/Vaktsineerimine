import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Peaklass {

    public static void main(String[] args) {

        // küsime kasutajalt sisendi
        Scanner sisend1 = new Scanner(System.in);
        Scanner sisend2 = new Scanner(System.in);

        System.out.println("Sisesta oma nimi: ");
        String kasutajaNimi = sisend1.nextLine();
        System.out.println("Tere " + kasutajaNimi);

        System.out.print("Milline krooniline haigus teil esineb: ");
        String kasutajaHaigus = sisend2.nextLine();

        Haigused väljundKlassistHaigus = new Haigused(kasutajaHaigus); // saadame klassi Haigused kasutaja poolt sisestatud haiguse

        System.out.println("Teie sisestasite " + kasutajaHaigus + ", kuid " + väljundKlassistHaigus);

        // loen sisse failist haigused listi
        ArrayList<String> haigused = new ArrayList<>();
        File failiSisu = new File("src/RiskigruppideKlassifikaator.txt");
        try (Scanner sc = new Scanner(failiSisu, "UTF-8")) {
            while(sc.hasNextLine()) {
                haigused.add(sc.nextLine()); // haigused lisatud failist listi
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Riskirühma kuuluvad haigused on: " + haigused);

    }

}

