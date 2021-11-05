import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    private static String fileName = "empresa.csv";
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "Apululu Viagens";
        empresa.cnpj = "52.564.489/301-22";
        empresa.ramo = "Turismo";
        
        //DAO - Object > String
        String empresString = String.format("%s;%s;%s\n", empresa.nome, empresa.cnpj, empresa.ramo);

        //ESCRITA
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(empresString);
            fileWriter.close();
        } catch (IOException e) {
           System.out.println("O arquivo não pode ser aberto!");
        }

        //LEITURA
        try {
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextLine()){
                 //DAO - String -> Object 
                 String linha = sc.nextLine();
                 String[] dadosEmpresa = linha.split(";");
                 Empresa e = new Empresa();
                 e.nome = dadosEmpresa[0];
                 e.cnpj = dadosEmpresa[1];
                 e.ramo = dadosEmpresa[2];
                 System.out.printf("\nNome empresa: %s \nCNPJ: %s \nRamo: %s\n", e.nome, e.cnpj, e.ramo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo não pode ser aberto!");
        }
    }
}
