public class PessoaFisica {
 
    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;
    private String cpf;

    // CODIGO PESSOA
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return this.codigo;
    }
    
    // NOME PESSOA
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    // SOBRENOME PESSOA
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }

    // IDADE PESSOA
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }

    // RG PESSOA
    public void setRG(String rg) {
        this.rg = rg;
    }
    public String getRG() {
        return this.rg;
    }

     // CPF PESSOA
     public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String getCPF() {
        return this.cpf;
    }
}
