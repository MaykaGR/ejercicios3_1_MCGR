class Rectangulo() {

    var base: Int = 0
    var altura: Int = 0

    constructor(base: Int, altura: Int) : this() {
        this.base = base
        this.altura = altura
    }

    fun perimetro(base: Int, altura: Int): Int {
        return 2 * base + 2 * altura
    }

    fun area(base: Int, altura: Int): Int {
        return base * altura
    }

    override fun toString(): String {
        return "Base: $base, Altura: $altura"
    }

}

fun main() {
    var rect1 = Rectangulo()
    rect1.base = 3
    rect1.altura = 4
    println(rect1)

    var a1 = rect1.area(3, 4)
    println("Área=$a1")
    var per1 = rect1.perimetro(3, 4)
    println("Perímetro=$per1")
}