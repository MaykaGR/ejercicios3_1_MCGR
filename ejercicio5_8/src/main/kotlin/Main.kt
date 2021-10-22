class Tiempo(var hora: Int = 0, var minuto: Int = 0, var segundo: Int = 0) {

    override fun toString(): String {
        return "$hora h $minuto m $segundo s" }
}

fun main() {
    var tiempo1 = Tiempo(1)
    println(tiempo1)
    var tiempo3 = Tiempo(1, 1)
    println(tiempo3)
    var tiempo2 = Tiempo(1, 1, 4)
    println(tiempo2)
    var tiempo4 = Tiempo()
    println(tiempo4.hora)
    println (tiempo4)
    var tiempo5 = Tiempo(12,6)
    println (tiempo5)
}