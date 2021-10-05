public class Funcionario extends Pessoa{

    private String salario;
    private String departamento;
    
    // SALARIO
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getSalario() {
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
