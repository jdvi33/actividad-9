package datos;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class BibliotecaDAOImpl implements BibliotecaDAO{
    private static BibliotecaDAOImpl instancia;
    private List<Articulo> articulos = new ArrayList<>();
    
    private BibliotecaDAOImpl(){
    }
    
    public static BibliotecaDAOImpl getInstance(){
        if (instancia == null) {
            instancia = new BibliotecaDAOImpl();
        } 
            return instancia;
        
    }

    @Override
    public Articulo getArticulo(String titulo, String autor) {
        return articulos.stream()
                .filter(a -> a.getTitulo().equals(titulo) && a.getAutor().equals(autor))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    @Override
    public void removerArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }

    @Override
    public Map<String, Integer> contarArticulosPorCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Articulo> getTodosArticulos() {
        return new ArrayList<>(articulos);
    }
}
