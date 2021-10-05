public class Coordenador extends Funcionario {

    private String cursoC;
    private double bonus = 0.10;

     // CURSO COORDENADO
     public void setCurso(String cursoC) {
        this.cursoC = cursoC;
    }
    public String getCurso() {
        return cursoC;
    }

     // BONUS
     public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    
}
