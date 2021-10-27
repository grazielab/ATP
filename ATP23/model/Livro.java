  package model;

public class Livro {

    private int id;
    private String nome;
    private String autor;

    public Livro(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public boolean equals(Object obj) {
        Livro outro = (Livro) obj;
        if (this.id == outro.id) {
            return true;
        } else {
            return false;
        }

    }

}
