class Coche(
    var color: String, val marca: String, val modelo: String,
    val numeroCaballos: Int, val numeroPuertas: Int, val matricula: Int
) {
    override fun toString(): String {
        return "$marca $modelo $matricula $color $numeroCaballos $numeroPuertas\n"
    }
}

fun main() {
 var coche1 = Coche("rojo","opel","corsa",40,4,3465657)
    println(coche1)
    var coche2 = Coche("azul","renault","v11", 50, 4,45456465)
    println(coche2)
    coche1.color="lila"
    println(coche1)
}