public class Funcionario extends Pessoa{

    private double salario;
    private String departamento;
    
    // SALARIO
    public void setNome(Double salari) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    // DEPARTAMENTO
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

}
