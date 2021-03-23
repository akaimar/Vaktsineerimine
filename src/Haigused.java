import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Haigused {
    private String kasOnRiskirühmas;

    public Haigused(String haigus) {
        this.kasOnRiskirühmas = haigus;
    }

    public String getHaigus() {
        return kasOnRiskirühmas;
    }

    public void setHaigus(String haigus) {
        this.kasOnRiskirühmas = haigus;
    }

    // meetod kontrollimaks, kas on inimene on riskirühmas
    public String kasOnRiskigrupis(String haigus){
        String tagastus = null;
        // for tsükliga käime listi läbi ja võrdleme
        // käivitame funktsiooni kuupäeva genereerimiseks
        for (String i : HaigusteNimekiri.haigusteLoend) {
            if (haigus.equals(i)) {
                tagastus = " kontroll: " + i + " on riskirühmas ja te kuulute eelisjärjekorras vaktsineerimisele!";
            }
            else {
                tagastus = " kontroll: " + i + " ei ole riskirühmas ja te ei kuulu eelisjärjekorras vaktsineerimisele!";
            }
        }
        return tagastus;
    }

    @Override
    public String toString() {
        return kasOnRiskigrupis(kasOnRiskirühmas);
    }

}
