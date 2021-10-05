public class Coordenador extends Funcionario {

    private String coordenador;
    private double bonus;

     // CURSO COORDENADO
     public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }
    public String getCoordenador() {
        return coordenador;
    }

     // BONUS
     public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }   
}
