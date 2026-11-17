Crea la clase Libro con los atributos titulo, autor y anio.
- Sobrescribe toString(), equals() (compara los tres atributos utilizando Objects.equals) y hashCode() (utilizando Objects.hash).
  Clase de prueba: TestLibro.
  En la clase TestLibro, realiza las siguientes operaciones:
  •
  Crea dos libros con los mismos datos y compáralos utilizando == y equals().
  •
  Comprueba que equals(null) y equals() con un objeto String devuelven false, y que libro1.equals(libro1) devuelve true.
  •
  Añade ambos libros a un HashSet<Libro> y muestra su tamaño. El resultado debe ser 1.
  •
  Guarda un libro en un HashMap<Libro, Integer>, donde el valor representa los ejemplares disponibles, y recupera el valor utilizando el otro libro, que tiene los mismos datos.
  •
  Comenta o elimina temporalmente el método hashCode() y comprueba qué ocurre con el tamaño del conjunto y con la búsqueda en el mapa. Normalmente, el conjunto tendrá tamaño 2 y la búsqueda devolverá null.
  Importante: Añade comentarios en el código para explicar las diferencias entre == y equals(), la utilidad de hashCode() y por qué es necesario sobrescribir ambos métodos para trabajar correctamente con HashSet y HashMap.