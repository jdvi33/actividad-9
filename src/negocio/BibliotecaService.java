package negocio;

import datos.Articulo;
import datos.BibliotecaDAO;
import datos.BibliotecaDAOImpl;
import java.util.List;

public class BibliotecaService extends BilbiotecaObservable{
    private BibliotecaDAO bibliotecaDAO;
    
    public BibliotecaService(){
        this.bibliotecaDAO = BibliotecaDAOImpl.getInstance();
    }
    
    public Articulo getArticulo(String titulo, String autor){
        return bibliotecaDAO.getArticulo(titulo, autor);
    }
    
    public void agregarArticulo(Articulo articulo){
        bibliotecaDAO.agregarArticulo(articulo);
        notifyObserver(" se agrego un nuevo articulo  " + articulo.getTitulo());
    }
    
    public void removerArticulo(Articulo articulo){
        bibliotecaDAO.removerArticulo(articulo);
        notifyObserver(" Se remocio el articulo " + articulo.getTitulo());
    }
    
    public List<Articulo> getTodosArticulos(){
        return bibliotecaDAO.getTodosArticulos();
    }
}
