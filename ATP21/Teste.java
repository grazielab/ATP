public class Teste {
    public static void main(String[] args) {
        

        System.out.println(" ======== Banco Bradesco ========  ");

        // CLIENTE CONTA POUPANÇA
        System.out.println(" \n ---- Conta Poupança ---- \n");
        Conta c = new Conta();
        c.setSaldo(2000);
        double saldoInicialC = c.getSaldo();
        c.transferencia(200);
        c.setCodigo(112233);

        System.out.printf("Cliente: %d \n",c.getCodigo());
        System.out.printf("Saldo anterior: R$ %.2f\n", saldoInicialC);
        System.out.printf("Saldo atual: R$ %.2f\n", c.getSaldo());
        
        // CLIENTE CONTA CORRENTE 
        System.out.println(" \n\n ---- Conta Corrente ---- \n ");
        ContaCorrente cc = new ContaCorrente();
        cc.setSaldo(1000);
        double saldoInicialCC = cc.getSaldo();
        cc.transferencia(100);
        cc.setCodigo(445566);

        System.out.printf("Cliente: %d \n", cc.getCodigo());
        System.out.printf("Saldo anterior: R$ %.2f\n", saldoInicialCC);
        System.out.printf("Saldo atual: R$ %.2f\n", cc.getSaldo());


        // CLIENTE CONTA CORRENTE COM MAIS DE 5 TRANSFERENCIAS 
        System.out.println(" \n ---- Conta Corrente ---- \n");
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setSaldo(100);
        double saldoInicialCC1 = cc1.getSaldo();
        cc1.setCodigo(778899);
        
        cc1.transferencia(10);
        cc1.transferencia(10);
        cc1.transferencia(10);
        cc1.transferencia(10);
        cc1.transferencia(10);

        System.out.printf("Cliente: %d \n", cc1.getCodigo());
        System.out.printf("Saldo anterior: R$ %.2f\n", saldoInicialCC1);
        System.out.printf("Saldo atual: R$ %.2f\n", cc1.getSaldo());

    }
}
