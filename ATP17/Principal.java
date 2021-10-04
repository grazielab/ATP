public class Principal {
    public static void main(String[] args) {
        Calculadora calcula = new Calculadora();

        double taxaISS = calcula.cISS(200);
        double taxaIOF = calcula.cIOF(600);
        double taxaIR = calcula.cIR(800);

        System.out.printf("O valor do imposto ISS foi de R$ %.4f \n", taxaISS);
        System.out.printf("O valor do imposto IOF foi de R$ %.4f \n", taxaIOF);
        System.out.printf("O valor do imposto IR foi de R$ %.4f \n", taxaIR);

    }
}

