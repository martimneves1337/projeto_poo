package edu.ufp.inf.projeto_poo_aed.modelos;

public class Artefactos {
    private String id;
    private String tipo;
    private double peso;
    private double valcient;

    public Artefactos(String id,String tipo,double peso,double valcient){
        this.id=id;
        this.tipo=tipo;
        this.peso=peso;
        this.valcient=valcient;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
    public double getPeso(){
        return peso;
    }

    public double getValcient() {
        return valcient;
    }
}
