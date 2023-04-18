package org.example;

import java.util.ArrayList;
import java.util.List;

public class Guerrero {

    private Integer nivelDeLucha;

    private List<Artefacto> artefactos;


//CONTRUCTORES
    //constructor no es vacío, ya que se toman valores iniciales para el guerrero
    public Guerrero() {
        artefactos = new ArrayList<>();
        nivelDeLucha = 0;
    }

//GET y SET

    public Integer getNivelDeLucha() {
        return nivelDeLucha;
    }

    public void setNivelDeLucha(Integer nivelDeLucha) {
        this.nivelDeLucha = nivelDeLucha;
    }

    public List<Artefacto> getArtefactos() {
        return artefactos;
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }



//OTROS
    //agregar artefacto a la lista
    public void agregarArtefacto (Artefacto artefacto){
        artefactos.add(artefacto);
    }

    public Integer cantidadArtefactos(){
        Integer cantidad = artefactos.size();
        return cantidad;
    }

}
