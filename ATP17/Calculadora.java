public class Calculadora {

    private double taxaISS = 0.04;
    private double taxaIOF = 0.09;
    private double taxaIR = 0.16;

    public double cISS(double valor) {
        double imposto = valor * taxaISS;
        return imposto;
    }

    public double cIOF(double valor) {
        double imposto = valor * taxaIOF;
        return imposto;
    }

    public double cIR(double valor) {
        double imposto = valor * taxaIR;
        return imposto;
    }
}