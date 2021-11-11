package com.company.saskaita;

import com.company.moketojas.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements Sildymas {

    private double kubai;

    public SildymasImpl(int kodas, String vardas, String pavarde, String adresas, double suma,
                        double kubai) {
        super(kodas, vardas, pavarde, adresas, suma);
        this.kubai = kubai;
    }

    @Override
    public double getKubai() {
        return kubai;
    }

    @Override
    public String toString() {
        return "SildymasImpl{" +
                "kubai=" + kubai +
                '}';
    }
}
