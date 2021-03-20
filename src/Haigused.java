/* siit tõmbame failist kõik haigused */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Haigused {

    // isendiväljad
    String haiguseNimetus; // Isendiväli (hiljem tuleb siia list) haiguste nimekirja jaoks
    String failiAsukoht = "src/RiskigruppideKlassifikaator.txt"

    // konstruktor

    public Haigused(String haiguseNimetus) {
        this.haiguseNimetus = haiguseNimetus;
    }

    // meetodid

    // POOLELI!!! loen sisse failist haigused listi (see tuleb teha funktsiooniks, mis väljastab haiguse)
    ArrayList<String> haigused = new ArrayList<>();
    File failiSisu = new File(failiAsukoht);
        try (Scanner sc = new Scanner(failiSisu, "UTF-8")) {
        while(sc.hasNextLine()) {
            haigused.add(sc.nextLine()); // haigused lisatud failist listi
        }
    }
        // return true or false (kas see haigus asub loetelus).

}
