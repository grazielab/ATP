package View;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("dados/streams.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write("HBO Max\n");
            bw.write("Disney+\n");
            bw.write("Netflix\n");
            bw.write("Prime Video\n");

            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível encontrar o arquivo.");
        } catch (IOException e) {
            System.out.println("Não foi possível escrever no arquivo!");
        }
    }
}

/*
 * Crie uma classe que contenha a estrutura para a leitura de um arquivo de
 * texto, o arquivo deve estar salvo em uma pasta de nome dados. Esta leitura
 * deve conter o fluxo de entrada de dados de um arquivo, um leitor de fluxo e
 * um buffer de leitura. Com o buffer, imprima as linhas do arquivo no console.
 * 
 * Crie uma outra classe que contenha a estrutura de escrita em um arquivo de
 * texto, o arquivo deve estar salvo em uma pasta de nome dados. A escrita de
 * conter um fluxo de saída para o arquivo, um forma de escrita no fluxo e um
 * buffer de escrita. Com o buffer, escreva algumas linhas dentro do arquivo
 * texto.
 */