public class Tela {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setnomeC("Dean Winchester");
        a1.setIdade(32);
        a1.setMatricula(112233);
        System.out.println(a1);

        Aluno a2 = new Aluno();
        a2.setnomeC("Sam Winchester");
        a2.setIdade(28);
        a2.setMatricula(445566);
        System.out.println(a2);
    }
}
