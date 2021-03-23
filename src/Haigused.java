import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Haigused {

    String haiguseNimetus; // Isendiväli (hiljem tuleb siia list) haiguste nimekirja jaoks
    String failiAsukoht = "src/RiskigruppideKlassifikaator.txt";

    // konstruktor

    public Haigused(String haiguseNimetus, String failiAsukoht) {
        this.haiguseNimetus = haiguseNimetus;
        this.failiAsukoht = failiAsukoht;
    }

    public Haigused(String astma) {
    }

    // meetod haiguste saamiseks listi

    public ArrayList haigusedFailist(failiAsukoht) {
        ArrayList<String> haigused = new ArrayList<>();
        File failiSisu = new File(failiAsukoht);
        try (Scanner sc = new Scanner(failiSisu, "UTF-8")) {
            while (sc.hasNextLine()) {
                haigused.add(sc.nextLine());
            }
        }
        return haigused;
    }

}
