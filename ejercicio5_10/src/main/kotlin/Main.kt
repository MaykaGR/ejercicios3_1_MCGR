/*Queremos mantener una colección de los libros que hemos ido leyendo, poniéndoles una calificación
 según nos haya gustado más o menos al leerlo. Para ello, crear la clase Libro, cuyos atributos son
  el título, el autor, el número de páginas y la calificación que le damos entre 0 y 10. Crear los
   métodos para poder modificar y obtener los atributos (sólo si tienen sentido).
  Posteriormente, crear una clase ConjuntoLibros, que almacena un conjunto de libros (con un vector de un tamaño
  fijo). Se pueden añadir libros que no existan (siempre que haya espacio), eliminar libros por título o autor,
  mostrar por pantalla los libros con la mayor y menor calificación y, por último, mostrar un contenido de to'do
  el conjunto. En el programa principal realizar las siguientes operaciones: crear dos libros, añadirlos al
  conjunto, eliminarlos por los dos criterios (título y autor) hasta que el conjunto esté vacío, volver a
  añadir un libro y mostrar el contenido final.*/

class Libro (var titulo: String, var autor: String, var numPags: Int, var calificacion: Int){
    var titulo = ""
    var autor = ""
    var numPags = 0
    var calificacion = 0

}
class ConjuntoLibros (var conjunto: Array<Libro?>(10)){

}

fun main() {

}