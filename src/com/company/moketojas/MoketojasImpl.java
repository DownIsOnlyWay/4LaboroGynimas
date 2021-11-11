package com.company.moketojas;


public class MoketojasImpl implements Moketojas {
    private int kodas;
    private String vardas;
    private String pavarde;
    private String adresas;
    private double suma;
    private final double vienaSask = 0;

    public MoketojasImpl(int kodas, String vardas, String pavarde, String adresas, double suma) {
        this.kodas = kodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }

    @Override
    public int getKodas() {
        return this.kodas;
    }

    @Override
    public String getVardas() {
        return this.vardas;
    }

    @Override
    public String getPavarde() {
        return this.pavarde;
    }

    @Override
    public double getSuma() {
        return this.suma;
    }

    @Override
    public double vienaSask(double suma, int kodas) {
        if (this.kodas == getKodas())
            return vienaSask + this.suma;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "MoketojasImpl{" +
                "pinigai=" + kodas +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", adresas='" + adresas + '\'' +
                ", suma=" + suma +
                '}';
    }
}
