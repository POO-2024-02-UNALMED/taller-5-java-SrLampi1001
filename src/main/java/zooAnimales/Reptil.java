package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas =0;
    public static int serpientes =0;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;
        putListado();
    }
    public Reptil(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, null, 0);
    }
    public Reptil(){
        this(null, 0, null);
    }
    public static int cantidadReptiles(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "reptar";
    }
    public static Reptil crearIguana(String nombre, int edad, String genero){
        AumentarIguana();
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        AumentarSerpiente();
        return new Reptil(nombre, edad, "jungla", genero, "blanco",1);
    }
    private static void AumentarIguana(){iguanas++;}
    private static void AumentarSerpiente(){serpientes++;}

    public String getColorEscamas(){return colorEscamas;}
    public int getLargoCola(){return largoCola;}
    public ArrayList<Reptil> getListado(){return listado;}
    private void putListado(){
        listado.add(this);
    }
}