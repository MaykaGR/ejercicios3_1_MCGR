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

class Cuenta(var numCuenta: String, var saldo: Double) {
    fun recibirAbono(saldo:Double): Double {
        println ("Introduce cantidad:")
        var incremento=readLine()
        var nuevosaldo=saldo+incremento
        return nuevosaldo
    }
    fun realizarPago(saldo:Double): Double{
        println("Cantidad del pago:")
        var decremento=readLine()
        var nuevosaldo=saldo-decremento
        return nuevosaldo
    }
}

class Persona(val DNI: String, var cuentas: Array<Cuenta>) {
    var cuentas: Array<Cuenta?> = arrayOfNulls(3)
    //var cuentas: throw IndexOutOfBoundsException("Límite alcanzado")

    /*fun addCuenta (num:Int, cuentas:MutableList<Cuenta>):MutableList<Cuenta> {
        val randomValues = List(5){ Random.nextInt(0, 100) }
        num=randomValues
        cuentas.add(num)
        return cuentas }*/
    fun addCuenta(numCuenta:String): Array<Cuenta>{
        cuentas.set=numCuenta
        return cuentas
    }
    fun morosidad (cuentas:Array<Cuenta>, saldo:Double ):Unit{
        if(saldo<0){println("moros@")}
    }
    //var cuentas:ArrayOfNulls(3)

}

//fun <T> List(size: Int): List<T> { }


fun main() {

}