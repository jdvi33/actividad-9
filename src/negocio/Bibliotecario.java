package negocio;

import datos.Articulo;
import java.util.ArrayList;
import java.util.List;

public class Bibliotecario {
    private String nombre;
    private List<Observer> observers;
    
    public Bibliotecario(String nombre){
        this.nombre = nombre;
        this.observers = new ArrayList<Observer>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
//    public void prestarAriculo(Articulo articulo){
//        if (articulo.isDisponible()) {
//            
//        } else {
//        }
//    }
}
