public class ContaCorrente extends Conta {

    private double taxaTransferencia = 10.50;
    private double taxaManutencao = 2.50;
    private int numTransferencia;

    @Override
    public void transferencia(double valorTransferencia) {
        super.transferencia(valorTransferencia);
        double novoSaldo = this.getSaldo() - taxaTransferencia;
        this.setSaldo(novoSaldo);

        if (numTransferencia % 5 == 0) {
            novoSaldo = this.getSaldo() - taxaManutencao;
            this.setSaldo(novoSaldo);
        }
        this.numTransferencia ++;
    }
}
