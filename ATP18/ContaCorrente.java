public class ContaCorrente {

    private String agencia;
    private int numero;
    private int codigo;
    private double saldo;


    // AGENCIA BANCO
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public String getAgencia(){
        return this.agencia;
    }

    // NUMERO BANCO
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }

    // CODIGO BANCO
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }
    
    //SALDO BANCO
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
}
