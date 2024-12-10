package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona{
    private String nombre;
    private final Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo = zoo;
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
    public Zoologico getZoo(){return zoo;}
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    @Override
    public String toString(){
        return nombre;
    }
}