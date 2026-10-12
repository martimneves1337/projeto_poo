package edu.ufp.inf.projeto_poo_aed.modelos;

public class Robos {
    private String id;
    private String tipo;
    private double bateria;


    public Robos (String id,String tipo,double bateria){
        this.id=id;
        this.bateria=bateria;
        this.tipo=tipo;
    }

    public String getId(){
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getBateria(){
        return bateria;
    }


}



