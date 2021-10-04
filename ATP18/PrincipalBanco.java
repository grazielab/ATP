public class PrincipalBanco {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente();

        cc1.setAgencia("Bradesco");
        String a = cc1.getAgencia();
        System.out.println(a);

        cc1.setNumero(2219);
        int n = cc1.getNumero();
        System.out.println(n);

        cc1.setCodigo(58694);
        int c = cc1.getCodigo();
        System.out.println(c);

        cc1.setSaldo(10.000);
        double s = cc1.getSaldo();
        System.out.println("R$" + s);

    }
}
