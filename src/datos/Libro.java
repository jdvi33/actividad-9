package datos;
public class Libro implements Articulo{
    private String titulo;
    private String autor;
    private String categoria;
    
    public Libro(String titulo, String autor, String categoria){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
    
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }


    @Override
    public String getCategoria() {
        return categoria;
    }    
}
