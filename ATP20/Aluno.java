public class Aluno extends Pessoa{

    private String curso;
    private int turma;

    // CURSO
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    // Turma
    public void setTurma(int turma) {
        this.turma = turma;
    }
    public int getTurma() {
        return turma;
    }
    
}
