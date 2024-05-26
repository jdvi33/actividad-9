package datos;

import java.util.ArrayList;
import java.util.List;

public class Coleccion implements Articulo{
    private String nombre;
    private List<Articulo> articulos;
    
    public Coleccion(String nombre){
        this.nombre = nombre;
        this.articulos = new ArrayList<>();
    }
    
    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);
    }
    
    public void removerArticulo(Articulo articulo){
        articulos.remove(articulo);
    }

    @Override
    public String getTitulo() {
        return nombre;
    }

    @Override
    public String getAutor() {
        return "N/A";
    }

    @Override
    public String getCategoria() {
        return "Coleccion";
    }
    
    public List<Articulo> getArticulos(){
        return articulos;
    }
}
