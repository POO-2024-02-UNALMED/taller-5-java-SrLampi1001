package zooAnimales;

import gestion.Zona;

public class Animal{
    private static int TotalAnimales=0;
    String nombre;
    int edad;
    String habitat;
    String genero;
    Zona zona;
    
    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        TotalAnimales++;
    }
    public Animal(String nombre, int edad, String genero){
        this(nombre, edad, null, genero);
    }
    public Animal(){
        this(null, 0, null);
    }

    public String movimiento(){
       return "desplazarse";
    }
    public static String totalPorTipo(){
        return "Mamiferos: " + (Mamifero.cantidadMamiferos()+1) + "\n"+"Aves: " + (Ave.cantidadAves()+2) + "\n"+"Reptiles: " + (Reptil.cantidadReptiles()+1) + "\n" + "Peces: " + (Pez.cantidadPeces()+1) + "\n"+"Anfibios: " + (Anfibio.cantidadAnfibios()+1);
    }
    public String getNombre(){return nombre;}
    public String getHabitat(){return habitat;}
    public String getGenero(){return genero;}
    public int getEdad(){return edad;}
    @Override
    public String toString(){
        if ((zona==null)) {
            return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
        } 
        return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona+", en el "+this.zona.getZoo();
    }
}