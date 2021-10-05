public class Universidade {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario();
        f.setNome("Mike");
        f.setSobreome("Hannigan");
        f.setMatricula(648565);
        f.setSalario("R$ 3.000");
        f.setDepartamento("Administrativo");

        Coordenador c = new Coordenador();
        c.setNome("Joey");
        c.setSobreome("Tribbiani");
        c.setMatricula(695841);
        c.setDepartamento("Educação");
        c.setCoordenador("Atuação");
        c.setSalario("R$ 6.000");
        c.setBonus(200);

        Aluno a = new Aluno();
        a.setNome("Graziela");
        a.setSobreome("Bartyra Bressanini Beckhauser");
        a.setMatricula(221911);
        a.setCurso("Atuação");
        a.setTurma(2);

        System.out.println(" ==== Universidade Friends ==== \n");

        System.out.println(" -- Funcionário -- ");
        System.out.println("Nome completo: " + f.getNome() + " " + f.getSobrenome());
        System.out.println("Matricula: " + f.getMatricula());
        System.out.println("Salário: " + f.getSalario());
        System.out.println("Departamento: " + f.getDepartamento() + "\n");

        System.out.println(" -- Coordenador -- ");
        System.out.println("Nome completo: " + c.getNome() + " " + c.getSobrenome());
        System.out.println("Matricula: " + c.getMatricula());
        System.out.println("Departamento: " + c.getDepartamento() + "\n");
        System.out.println("Curso Coordenado: " + c.getCoordenador());
        System.out.println("Salário: " + c.getSalario());
        System.out.println("Bônus: R$ " + c.getBonus());
        
        System.out.println(" -- Aluno -- ");
        System.out.println("Nome completo: " + a.getNome() + " " + a.getSobrenome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Curso: " + a.getCurso());
        System.out.println("Turma: " + a.getTurma());

    }
}
