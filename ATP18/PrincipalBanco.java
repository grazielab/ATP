public class PrincipalBanco {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente();

        cc1.setAgencia("Bradesco");
        String a = cc1.getAgencia();

        cc1.setNumero(2219);
        int n = cc1.getNumero();
        
        cc1.setCodigo(58694);
        int c = cc1.getCodigo();

        cc1.setSaldo(10000);
        double s = cc1.getSaldo();
        
        //Print do Banco
        System.out.println("Banco: " + a);
        System.out.println("Número da agência: " + n);
        System.out.println("Código da agência: " + c);
        System.out.println("Saldo em conta: R$" + s);
        
    }
}
