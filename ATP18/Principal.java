public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setCodigo(0001);
        int c = p1.getCodigo();
        System.out.println(c);

        p1.setNome("Celular");
        String n = p1.getNome();
        System.out.println(n);

        p1.setDescricao("Iphone 13");
        String d = p1.getDescricao();
        System.out.println(d);

        p1.setValor(12.999);
        double v = p1.getValor();
        System.out.println("R$" + v);

    }
}