package edu.ufp.inf.projeto_poo_aed.modelos;

public class Salas {
    private String id;
    private String tipo;

    public Salas(String id, String tipo){
        this.id=id;
        this.tipo=tipo;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}


