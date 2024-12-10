package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos =0;
    public static int leones =0;
    private Boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.pelaje=pelaje;
        this.patas=patas;
        putListado();
    }
    public Mamifero(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, true, 4);
    }
    public Mamifero(){
        this(null, 0, null);
    }
    public static int cantidadMamiferos(){
        return listado.size();
    }
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        AumentarCaballo();
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        AumentarLeon();
        return new Mamifero(nombre, edad,"selva", genero, true, 4);
    }
    private static void AumentarCaballo(){caballos++;}
    private static void AumentarLeon(){leones++;}

    public Boolean isPelaje(){return pelaje;}
    public int getPatas(){return patas;}
    public ArrayList<Mamifero> getListado(){return listado;}
    private void putListado(){
        listado.add(this);
    }
}