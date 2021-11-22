package P2;

import java.util.ArrayList;

public interface IPontoTCrud {
    public String save(PontoTuristico model);
    public ArrayList<PontoTuristico> read();
}
