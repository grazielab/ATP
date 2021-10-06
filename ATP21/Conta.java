public class Conta {

    private double saldo;
    private int codigo;

    public void transferencia(double valorTransferencia) {
        saldo -= valorTransferencia;
        System.out.printf("Transferencia realizada: %.2f \n", valorTransferencia);
    }

    // SALDO
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    // CODIGO
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

}