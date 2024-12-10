package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas =0;
    public static int salamandras =0;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;
        putListado();
    }
    public Anfibio(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, null, false);
    }
    public Anfibio(){
        this(null, 0, null);
    }
    public static int cantidadAnfibios(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "saltar";
    }
    public static Anfibio crearRana(String nombre, int edad, String genero){
        AumentarRana();
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        AumentarSalamandra();
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
    private static void AumentarRana(){ranas++;}
    private static void AumentarSalamandra(){salamandras++;}
    
    public String getColorPiel(){return colorPiel;}
    public Boolean isVenenoso(){return venenoso;}
    private void putListado(){
        listado.add(this);
    }
    public ArrayList<Anfibio> getListado(){return listado;}
}