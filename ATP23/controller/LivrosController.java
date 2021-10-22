package controller;

import java.util.ArrayList;

import model.Livro;

public class LivrosController {
    private ArrayList<Livro> listaLivros = new ArrayList<Livro>();

    // CRUD
    public void create(Livro livro) {
        this.listaLivros.add(livro);
    }

    public ArrayList<Livro> read(){
        return this.listaLivros;
    }

    public void update(Livro livro) {

    }

    public void delete(Livro livro) {
        this.listaLivros.remove(livro);
    }
}