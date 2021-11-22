package P2;
import java.util.ArrayList;

public class PontoTuristicoLista implements IPontoTCrud{
private ArrayList<PontoTuristico> lista = new ArrayList<PontoTuristico>();
    @Override
    public String save(PontoTuristico model) {
        this.lista.add(model);
        return String.format("Ponto Turistico %s salvo com sucesso!", model.nome);
    }

    @Override
    public ArrayList<PontoTuristico> read() {
        return this.lista;
    }
    
}
