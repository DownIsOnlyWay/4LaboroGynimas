package com.company;

import com.company.moketojas.MoketojasImpl;
import com.company.saskaita.Internetas;
import com.company.saskaita.InternetasImpl;
import com.company.saskaita.SildymasImpl;
import com.company.saskaita.TelefonasImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {


        MoketojasImpl moketojas1 = new MoketojasImpl(858588, "Jonas", "Jonaitis", "jonu g.2", 200);
        MoketojasImpl moketojas2 = new MoketojasImpl(111111, "Petras", "Petraitis", "petro g.4", 150);
        MoketojasImpl moketojas3 = new MoketojasImpl(222222, "Juozas", "Juozaitis", "juozo g.3", 300);

        TelefonasImpl telefonas1 = new TelefonasImpl(111111, "Petras", "Petraitis", "petro g.4", 300, 86111111);
        TelefonasImpl telefonas2 = new TelefonasImpl(222222, "Juozas", "Juozaitis", "juozo g.3", 50, 86222222);
        TelefonasImpl telefonas3 = new TelefonasImpl(858588, "Jonas", "Jonaitis", "jonu g.2", 70, 86858585);

        InternetasImpl internetas1 = new InternetasImpl(111111, "Petras", "Petraitis", "petro g.4", 30, "12.65.84.45");
        InternetasImpl internetas2 = new InternetasImpl(858588, "Jonas", "Jonaitis", "jonu g.2", 75, "48.56.41.45");
        InternetasImpl internetas3 = new InternetasImpl(222222, "Juozas", "Juozaitis", "juozo g.3", 60, "56.52.45.41");

        SildymasImpl sildymas1 = new SildymasImpl(858588, "Jonas", "Jonaitis", "jonu g.2", 65, 3.3);
        SildymasImpl sildymas2 = new SildymasImpl(111111, "Petras", "Petraitis", "petro g.4", 53, 2.6);
        SildymasImpl sildymas3 = new SildymasImpl(222222, "Juozas", "Juozaitis", "juozo g.3", 99, 5.3);

        MoketojasImpl[] mo = new MoketojasImpl[12];
        mo[0] = moketojas1;
        mo[1] = moketojas2;
        mo[2] = moketojas3;
        mo[3] = telefonas1;
        mo[4] = telefonas2;
        mo[5] = telefonas3;
        mo[6] = internetas1;
        mo[7] = internetas2;
        mo[8] = internetas3;
        mo[9] = sildymas1;
        mo[10] = sildymas2;
        mo[11] = sildymas3;



        int kodas;
        double suma = 0;
        System.out.println("Sarasas ");
        for (MoketojasImpl mok1 : mo) {
            if (mok1 instanceof TelefonasImpl ) {
                kodas = mok1.getKodas();
                suma = mok1.getSuma();
                for (MoketojasImpl mok2 : mo) {
                    if ( mok2 instanceof InternetasImpl) {
                        if (kodas == mok2.getKodas())
                            suma += mok2.getSuma();
                    }
                }
                System.out.println("Moketojo kodas: "+ mok1.getKodas() + " suma: " + suma);
            }
        }
    }

}
