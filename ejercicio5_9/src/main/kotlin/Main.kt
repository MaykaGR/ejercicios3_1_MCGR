/*Se quiere crear una clase Cuenta la cual se caracteriza por tener asociado un número de cuenta
 y un saldo disponible. Además, se puede consultar el saldo disponible, recibir abonos y realizar pagos.
Crear además una clase Persona, que se caracteriza por un DNI y un vector (Preguntar al profesor si
tienes dudas sobre vector) de cuentas bancarias. La Persona puede tener asociada hasta 3 cuentas bancarias,
y debe tener un método que permita añadir cuentas (hasta 3 que es el máximo).
También debe contener un método que devuelva si la persona es morosa (si tienen alguna cuenta con saldo negativo).
En el programa principal, instanciar un objeto Persona con un DNI cualquiera, así como dos objetos cuenta,
una sin saldo inicial y otra con 700 euros. La persona recibe la nómina mensual,
por lo que ingresa 1100 euros en la primera cuenta, pero tiene que pagar el alquiler de 750 euros
con la segunda. Imprimir por pantalla si la persona es morosa.
Posteriormente hacer una transferencia de una cuenta a otra
(de forma que todos los saldos sean positivos) y mostrar por pantalla el estado de la persona.*/

class Cuenta(val numCuenta: String, var saldo: Double = 0.0) {

    fun recibirAbono(abono: Double): Double {
        this.saldo += abono
        return saldo
    }

    fun realizarPago(pago: Double): Double {
        saldo -= pago
        return saldo
    }
}

class Persona(val DNI: String) {
    private var numCuentas = 0
    var cuentas: Array<Cuenta?> = arrayOfNulls(3)
    //var cuentas: throw IndexOutOfBoundsException("Límite alcanzado")

    /*fun addCuenta (num:Int, cuentas:MutableList<Cuenta>):MutableList<Cuenta> {
        val randomValues = List(5){ Random.nextInt(0, 100) }
        num=randomValues
        cuentas.add(num)
        return Boolean, indicando True si se añade correctamente, False en caso contrario }*/
    fun addCuenta(cuenta: Cuenta): Boolean {
        var resultado: Boolean
        resultado = false
        if (numCuentas < 3) {
            cuentas[numCuentas] = cuenta
            numCuentas++
            resultado = true
        }
        return resultado
    }

    fun morosidad(cuentas: Array<Cuenta>, saldo: Double): Boolean {
        if (saldo < 0) {
            return true
        }
        else return false
    }


}

//fun <T> List(size: Int): List<T> { }


fun main() {
    var pago : Double = 0.0
    var abono : Double = 0.0
    var c1 = Cuenta("cta1")
    var p1 = Persona("123")
    if (p1.addCuenta(c1))
        println("Cuenta ${c1.numCuenta} añadida correctamente")
    else
        println("Error añadiendo la cuenta ${c1.numCuenta}")
    var c2 = Cuenta("cta2", 700.0)
    if (p1.addCuenta(c2))
        println("Cuenta ${c2.numCuenta} añadida correctamente")
    else
        println("Error añadiendo la cuenta ${c2.numCuenta}")
    println("Realizar abono:")
    abono = (readLine() ?: "0.0").toDouble()
    c1.recibirAbono(abono)
    println(c1.saldo)
    println ("Realizar pago:")
    pago = (readLine() ?: "0.0").toDouble()
    c2.realizarPago(pago)
    println(c2.saldo)
    //p1.morosidad(cuentas,saldo) if true println ("moros@")
}