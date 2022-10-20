package pdf_25

import java.util.Scanner

// en este ejercicio podemos ver como en una clase podemos utilizar funciones dentro de otras funcionesdd

val sc = Scanner(System.`in`)
fun main(args: Array<String>) {
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}

class Operaciones {
    var valor1: Int = 0
    var valor2: Int = 0
    fun cargar() {

        print("Ingrese primer valor: ")
        valor1 = sc.nextInt()
        print("Ingrese segundo valor: ")
        valor2 = sc.nextInt()
        sumar()
        restar()
    }
    fun sumar() {
        val suma = valor1 + valor2
        println("La suma es $suma")
    }
    fun restar() {
        val resta = valor1 - valor2
        println("La resta es $resta")
    }
}
