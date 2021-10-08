public class ContaCorrente {

    private double saldo;
    private double taxaSaque = 5.0;
    private int codCliente;

    public ContaCorrente(double saldo, int codCliente) {
        this.saldo = saldo;
        this.codCliente = codCliente;

    }

    public void saque(double valorSaque) {
        this.saldo -= (valorSaque + this.taxaSaque);
    }

    public void deposito(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "Saldo: " + this.saldo + 
               "\nCódigo Cliente: " + this.codCliente + 
               "\nTaxa Saque: " + this.taxaSaque;
    }
}
