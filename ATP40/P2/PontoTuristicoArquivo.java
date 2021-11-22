package P2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PontoTuristicoArquivo implements IPontoTCrud{
    private String fileName = "P2/pontosturisticos.csv";


    @Override
    public String save(PontoTuristico model) {
     String msgRetorno;

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(model.toString() + "\n");
            fileWriter.close();
            msgRetorno = String.format("Ponto Turistico %s salvo com sucesso!", model.nome);
        } catch (IOException e) {
            msgRetorno = "Erro ao salvar Ponto Turisco no arquivo";
        }
        return msgRetorno;
    }

    @Override
    public ArrayList<PontoTuristico> read() {
        
        return null;
    }
    


}
