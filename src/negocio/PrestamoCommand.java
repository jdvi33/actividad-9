package negocio;

import datos.Articulo;

public class PrestamoCommand {
    private Articulo articulo;
    private boolean prestado;
    
    public PrestamoCommand(Articulo articulo){
        this.articulo = articulo;
        this.prestado = false;
    }
    
    public void ejecutar(){
        if (!prestado) {
            prestado = true;
            System.out.println(articulo.getTitulo() + " ha sido prestado");
        } else {
            System.out.println(articulo.getTitulo() + " ya esta prestado.");
        }
    }
    
    public void deshacer(){
        if (prestado) {
            prestado = false;
            System.out.println(articulo.getTitulo() + " ha sido devuelto");
        }
    }
    
    public boolean isPrestado(){
        return prestado;
    }
}
