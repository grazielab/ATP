public class Produto {

    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    // CODIGO PRODUTO
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    // NOME PRODUTO
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    //DESCRIÇÃO PRODUTO
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    //VALOR PRODUTO
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

}
