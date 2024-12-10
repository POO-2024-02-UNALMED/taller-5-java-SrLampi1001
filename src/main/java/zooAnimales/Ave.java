package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPulmas){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.colorPlumas=colorPulmas;
        putListado();
    }
    public Ave(String nombre, int edad, String genero){
        this(nombre, edad, null, genero, null);
    }
    public Ave(){
        this(null,0,null, null, null);
    }
    public static int cantidadAves(){
        return listado.size();
    }
    @Override
    public String movimiento(){
        return "volar";
    }
    public static Ave crearHalcon(String nombre, int edad, String genero){
        AumentarHalcon();
        return new Ave(nombre, edad, "montañas", genero, "café glorioso");
    }
    public static Ave crearAguila(String nombre, int edad, String genero){
        AumentarAguila();
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }
    private static void AumentarHalcon(){halcones++;}
    private static void AumentarAguila(){aguilas++;}

    public String getColorPlumas(){return colorPlumas;}
    public ArrayList<Ave> getListado(){return listado;}
    private void putListado(){
        listado.add(this);
    }
    
}