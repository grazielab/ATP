public class Universidade {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        f.setNome("Joey");
        f.setSobreome("Tribbiani");
        f.setMatricula(6485);
        f.setSalario("R$ 3.000");
        f.setDepartamento("Ensino");

        Coordenador c = new Coordenador();
        c.setCoordenador("Curso de Atuação");
        c.setBonus(200);
        c.setSalario("R$ 6.000");
        c.setDepartamento("Ensino");

        Aluno a = new Aluno();
        a.setNome("Graziela");
        a.setSobreome("Bartyra Bressanini Beckhauser");
        a.setMatricula(1911);
        a.setCurso("Atuação");
        a.setTurma(2);

        System.out.println(" ==== Universidade Friends ==== \n");

        System.out.println(" -- Funcionário -- ");
        System.out.println("Nome completo: " + f.getNome() + " " + f.getSobrenome());
        System.out.println("Matricula: " + f.getMatricula());
        System.out.println("Salário: " + f.getSalario());
        System.out.println("Departamento: " + f.getDepartamento() + "\n");

        System.out.println(" -- Coordenador -- ");
        System.out.println("Coordenador: " + c.getCoordenador());
        System.out.println("Bônus: R$ " + c.getBonus());
        System.out.println("Salário: " + c.getSalario());
        System.out.println("Departamento: " + c.getDepartamento() + "\n");

        System.out.println(" -- Aluno -- ");
        System.out.println("Nome completo: " + a.getNome() + " " + a.getSobrenome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Curso: " + a.getCurso());
        System.out.println("Turma: " + a.getTurma());

    }
}
