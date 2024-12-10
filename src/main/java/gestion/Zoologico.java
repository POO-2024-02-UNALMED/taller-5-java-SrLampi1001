package gestion;

import java.util.ArrayList;

public class Zoologico{
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(String nombre, String ubicacion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
    }
    public Zoologico(){
        this(null, null);
    }
    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }
    public int cantidadTotalAnimales(){
        int numT =0;
        for (Zona an : zonas) {
            numT =+ numT+ an.cantidadAnimales();
        }
        return numT;
    }
    public ArrayList<Zona> getZona(){return zonas;}
    public String getNombre(){return nombre;}
    public String getUbicacion(){return ubicacion;}
    @Override
    public String toString(){
        return nombre;
    }

}