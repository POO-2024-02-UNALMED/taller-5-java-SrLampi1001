package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones =0;
    public static int bacalaos =0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
        putListado();
    }
    public Pez(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, null, 0);
    }
    public Pez(){
        this(null, 0, null);
    }
    public static int cantidadPeces(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "nadar";
    }
    public static Pez crearSalmon(String nombre, int edad, String genero){
        AumentarSalmon();
        return new Pez(nombre, edad, "océano", genero,"rojo", 6);
    }
    public static Pez crearBacalao(String nombre, int edad, String genero){
        AumentarBacalao();
        return new Pez(nombre, edad, "océano",genero,"gris", 6);
    }
    private static void AumentarSalmon(){salmones++;}
    private static void AumentarBacalao(){bacalaos++;}

    public String getColorEscamas(){return colorEscamas;}
    public int getCantidadAletas(){return cantidadAletas;}
    public ArrayList<Pez> getListado(){return listado;}
    private void putListado(){
        listado.add(this);
    }
}