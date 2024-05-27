El caso de uso se centra en el prestamo de un libro dentro de una biblioteca
/biblioteca
|-- /src
|   |-- /datos
|   |   |-- Articulo.java
|   |   |-- Libro.java
|   |   |-- Coleccion.java
|   |   |-- BibliotecaDAO.java
|   |   |-- BibliotecaDAOImpl.java
|   |   |-- LibroFactory.java
|   |-- /negocio
|   |   |-- BibliotecaObservable.java
|   |   |-- Observer.java
|   |   |-- BibliotecaService.java
|   |   |-- PrestamoCommand.java
|   |-- /presentacion
|   |   |-- BibliotecarioUI.java
|   |   |-- UsuarioUI.java
|   |-- /resources
|-- /tests
|-- .gitignore
|-- build.xml

Esta desarrollado en java con el ide de netbeans


los patrones de diseño usados fueron en creacional fatory method que se ve en la clase Libro Factory, comportamiento el command para que cada operacion sea tratada como una instruccion aparte esta se ve en la clase PrestamoCommand, estructural el bridge ya que me garantiza que puedo tener diferentes tios de articulos se usa en la interface Articulo
Principios SOLID:
Responsabilidad unica - en mi implementacion los podria ver en las clases Libro Coleccion, BibliotecaDAO, BibliotecaService
OCP-   en la clase BibliotecaSerice puede ser extendida mediante herencia sin necesidad de modificar e codigo existente 
LSP - se muestra este principio en Libro, Coleccion son subclasaes de Articulo, estos pueden ser reemplazados  por instancias de los mismos
ISP -  BibliotecaDAOImpl implementa solo las clases que este ncesia para funcionar 
DSP - BibliotecaService depende de una abstraccion como es BibliotecaDAO y no asi de su implementacion facilitando los cambios
