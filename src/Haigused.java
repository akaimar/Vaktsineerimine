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
        if(haigus == "astma"){
            tagastus = "On riskirühmas";
        }
        else {
            tagastus = "Ei ole riskirühmas";
        }
        return tagastus;
    }


    @Override
    public String toString() {
        return kasOnRiskigrupis(kasOnRiskirühmas);
    }

}
