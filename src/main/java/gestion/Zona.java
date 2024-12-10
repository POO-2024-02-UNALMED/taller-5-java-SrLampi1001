package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona{
    private String nombre;
    private Zoologico[] zoo;
    private ArrayList<Animal> animales;

    public Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo = new Zoologico[1];
        this.zoo[0] = zoo;
    }
    public Zona(){
        this(null, null);
    }
    public void agregarAnimales(Animal animal){
            this.animales.add(animal);
    }
    public int cantidadAnimales(){
        return animales.size();
    }
    public Zoologico getZoo(){return zoo[0];}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setZoo(Zoologico zoo){this.zoo[0]=zoo;}
    @Override
    public String toString(){
        return nombre;
    }
}