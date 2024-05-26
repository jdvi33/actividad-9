package presentacion;

import datos.Articulo;
import datos.Coleccion;
import datos.LibroFactory;
import negocio.BibliotecaService;
import negocio.Observer;
import negocio.PrestamoCommand;

public class Biblioteca2 {
    public static void main(String[] args) {
        BibliotecaService bibliotecaService = new BibliotecaService();

        // Crear un observador para recibir notificaciones
        Observer observador = mensaje -> System.out.println("Notificación: " + mensaje);
        bibliotecaService.addObserver(observador);

        // Crear fábrica de libros
        LibroFactory libroFactory = new LibroFactory();

        // Crear algunos libros
        Articulo libro1 = libroFactory.createArticulo("1984", "George Orwell", "Ciencia Ficción");
        Articulo libro2 = libroFactory.createArticulo("Brave New World", "Aldous Huxley", "Ciencia Ficción");

        // Crear una colección y agregar los libros
        Coleccion coleccion = new Coleccion("Distopías");
        coleccion.agregarArticulo(libro1);
        coleccion.agregarArticulo(libro2);

        // Agregar libros y colección a la biblioteca
        bibliotecaService.agregarArticulo(libro1);
        bibliotecaService.agregarArticulo(libro2);
        bibliotecaService.agregarArticulo(coleccion);

        // Prestar un libro individual
        PrestamoCommand prestarLibro1 = new PrestamoCommand(libro1);
        prestarLibro1.ejecutar();

        // Verificar si el libro está prestado
        System.out.println("Disponibilidad de '1984': " + !prestarLibro1.isPrestado());

        // Devolver el libro
        prestarLibro1.deshacer();
        System.out.println("Disponibilidad de '1984' después de devolver: " + !prestarLibro1.isPrestado());

    }
    
}
