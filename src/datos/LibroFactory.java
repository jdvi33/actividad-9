package datos;
public class LibroFactory implements ArticuloFactory{

    @Override
    public Articulo createArticulo(String titulo, String autor, String categoria) {
        return new Libro(titulo,autor,categoria);
    }
    
}
