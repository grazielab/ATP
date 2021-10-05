import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        PessoaFisica[] pessoa = new PessoaFisica[5];
        
        PessoaFisica p1 = new PessoaFisica();
        PessoaFisica p2 = new PessoaFisica();
        PessoaFisica p3 = new PessoaFisica();
        PessoaFisica p4 = new PessoaFisica();
        PessoaFisica p5 = new PessoaFisica();

        //Pessoas 
        p1.setCodigo(5678);
        p1.setNome("Rachel");
        p1.setSobrenome("Green");
        p1.setIdade(28);
        p1.setRG("1.589.322");
        p1.setCPF("651.789.652-23");

        p2.setCodigo(4567);
        p2.setNome("Ross");
        p2.setSobrenome("Geller");
        p2.setIdade(30);
        p2.setRG("8.895.541");
        p2.setCPF("231.012.164-36");

        p3.setCodigo(8910);
        p3.setNome("Monica");
        p3.setSobrenome("Geller");
        p3.setIdade(28);
        p3.setRG("7.031.478");
        p3.setCPF("221.365.213-52");

        p4.setCodigo(1112);
        p4.setNome("Chandler");
        p4.setSobrenome("Bing");
        p4.setIdade(31);
        p4.setRG("3.578.215");
        p4.setCPF("457.651.654-87");

        p5.setCodigo(1314);
        p5.setNome("Phoebe");
        p5.setSobrenome("Buffay");
        p5.setIdade(33);
        p5.setRG("6.365.870");
        p5.setCPF("870.219.372-09");

        // Vetor
        pessoa[0] = p1;
        pessoa[1] = p2;
        pessoa[2] = p3;
        pessoa[3] = p4;
        pessoa[4] = p5;

        for (PessoaFisica p : pessoa){
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Nome completo: " + p.getNome() + " " + p.getSobrenome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("RG: " + p.getRG());
            System.out.println("CPF: " + p.getCPF() + "\n");
        }
    }
}
