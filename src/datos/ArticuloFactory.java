package datos;
public interface ArticuloFactory {
    Articulo createArticulo(String titulo, String autor, String categoria);
}
