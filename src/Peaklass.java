import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Peaklass {
    public static void main(String[] args) throws FileNotFoundException {

        // testin faili lugejat
        File file = new File("src/RiskigruppideKlassifikaator.txt");
        Scanner scan = new Scanner(file); // skännime praegu faili
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
