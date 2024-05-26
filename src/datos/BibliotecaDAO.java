package datos;

import java.util.List;
import java.util.Map;

public interface BibliotecaDAO {
    Articulo getArticulo(String titulo, String autor);
    void agregarArticulo(Articulo articulo);
    void removerArticulo(Articulo articulo);
    Map<String, Integer> contarArticulosPorCategoria();
    List<Articulo> getTodosArticulos();
}
