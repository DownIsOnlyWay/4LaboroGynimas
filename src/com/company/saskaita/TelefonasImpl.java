package com.company.saskaita;

import com.company.moketojas.MoketojasImpl;


public class TelefonasImpl extends MoketojasImpl implements Telefonas {
    private int numeris;

    public TelefonasImpl(int kodas, String vardas, String pavarde, String adresas, double suma,
                         int numeris) {
        super(kodas, vardas, pavarde, adresas, suma);
        this.numeris = numeris;
    }

    @Override
    public int getNumeris() {
        return this.numeris;
    }

    @Override
    public double getSuma() {
        return super.getSuma();
    }

    @Override
    public int getKodas() {
        return super.getKodas();
    }

    @Override
    public String toString() {
        return "TelefonasImpl{" +
                "numeris=" + numeris +
                '}';
    }
}
