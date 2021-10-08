public class Tela {
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();

        // INT
        int r1 = c.soma(1, 1);

        // DOUBLE
        double r2 = c.soma(1.5, 1.5);

        // FLOAT
        float r3 = c.soma(1.9f, 1.0f, 1.1f);

        // LONG
        long r4 = c.soma(10, 20, 30);

        // PRINT RESULTADOS
        System.out.println("Resultado Int: " + r1);
        System.out.println("Resultado Double: " + r2);
        System.out.println("Resultado Float: " + r3);
        System.out.println("Resultado Long: " + r4);

    }
}
