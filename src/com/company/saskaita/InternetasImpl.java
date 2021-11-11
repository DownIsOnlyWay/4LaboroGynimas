package com.company.saskaita;

import com.company.moketojas.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements Internetas {

    private String ip;


    public InternetasImpl(int kodas, String vardas, String pavarde, String adresas, double suma,
                          String ip) {
        super(kodas, vardas, pavarde, adresas, suma);
        this.ip = ip;
    }


    @Override
    public double getSuma() {
        return super.getSuma();
    }

    @Override
    public String getIp() {
        return this.ip;
    }

    @Override
    public int getKodas() {
        return super.getKodas();
    }

    @Override
    public String getVardas() {
        return super.getVardas();
    }

    @Override
    public String getPavarde() {
        return super.getPavarde();
    }

    @Override
    public double vienaSask(double suma, int kodas) {
        if (kodas == this.getKodas())
            return suma;
        return 0;
    }

    @Override
    public String toString() {
        return "InternetasImpl{" +
                "ip='" + ip + '\'' +
                '}';
    }

}
