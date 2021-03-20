import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Peaklass {
    public static void main(String[] args) throws IOException {

        // paneme haigused listi
        ArrayList<String> haigused = new ArrayList<>();

        // loen sisse failist haigused
        File failiSisu = new File("src/RiskigruppideKlassifikaator.txt");
        try (Scanner sc = new Scanner(failiSisu, "UTF-8")) {
            while(sc.hasNextLine()) {
                haigused.add(sc.nextLine()); // haigused lisatud failist listi
            }
        }
        System.out.println(haigused);

        // testin faili kirjutajat
        String tekstSisse = "Mikk Mihkelson 10.04.2021";
        FileWriter writer = new FileWriter("src/VaktsineerimiseNimekiri.txt");
        writer.write(tekstSisse);
        writer.close();

    }
}
