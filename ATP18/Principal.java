public class Principal {

    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setCodigo(3251);
        int c = p1.getCodigo();
        
        p1.setNome("Celular");
        String n = p1.getNome();

        p1.setDescricao("Iphone 13");
        String d = p1.getDescricao();
        
        p1.setValor(12.999);
        double v = p1.getValor();
        
        //Print do produto 
        System.out.println("Código do Produto: "+ c);
        System.out.println("Nome do Produto: " + n);
        System.out.println("Descrição do Produto" + d);
        System.out.println("Valor do Produto: R$" + v);
    }
}