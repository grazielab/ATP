package Controller;

import java.util.ArrayList;

public class ControllerBase<D> {
    private ArrayList<D> dados;

    public ControllerBase() {
        this.dados = new ArrayList<D>();
    }

    // CRIANDO O CRUD
    // create
    public void create(D obj) {
        dados.add(obj);
    }

    // read
    public ArrayList<D> read() {
        return this.dados;
    }

    // update
    public void update(D obj) {
        if (existe(obj)) {
            this.delete(obj);
            this.create(obj);
        }
    }

    // delete
    public void delete(D obj) {
        this.dados.remove(obj);
    }

    // Validando boolean
    public boolean existe(D obj) {
        return this.dados.contains(obj);
    }

}
