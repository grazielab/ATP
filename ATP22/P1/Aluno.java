public class Aluno {

    private String nomeC;
    private int idade;
    private int matricula;

    // nome completo
    public void setnomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getnomeC() {
        return this.nomeC;
    }

    // idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    // matricula
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        String objetoString = "Nome completo: " + this.nomeC + 
                              "\nIdade: " + this.idade + 
                              "\nMatricula: " + this.matricula + "\n";
        return objetoString;
    }

}