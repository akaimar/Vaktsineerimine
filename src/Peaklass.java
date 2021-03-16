import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Peaklass {
    public static void main(String[] args) throws IOException {

        // testin faili lugejat
        File file = new File("src/RiskigruppideKlassifikaator.txt");
        Scanner scan = new Scanner(file); // skännime praegu faili
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

        // testin faili kirjutajat
        String failiSisu = "10.04.2021";
        FileWriter writer = new FileWriter("src/VaktsineerimiseNimekiri.txt");
        writer.write(failiSisu);
        writer.close();

    }
}
