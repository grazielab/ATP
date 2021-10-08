public class TelaBanco {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100, 854394);

       cc.saque(20);
       cc.deposito(70);

       System.out.println(cc);
        
    }
}
