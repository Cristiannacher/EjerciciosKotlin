package pdf_27

import java.util.*

// en este ejercicio nos muestra que podemos hacer las variables de una calse private, esto quiere decir que estas variables
// solo seran accesibles y utilizables dentro de la clase, es decir que luego cuando usemos la clase no las podremos utilizar,
// ya que por defecto cuando las creas son publicas

val sc = Scanner(System.`in`)
fun main(args: Array<String>) {
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}

class Operaciones {
     var valor1: Int = 0
    private var valor2: Int = 0
    fun cargar() {
        println("Ingrese primer valor:")
        valor1 = sc.nextInt()
        println("Ingrese segundo valor:")
        valor2 = sc.nextInt()
        sumar()
        restar()
    }
    private fun sumar() {
        val suma = valor1 + valor2
        println("La suma de $valor1 y $valor2 es $suma")
    }

    private fun restar() {
        val resta = valor1 - valor2
        println("La resta de $valor1 y $valor2 es $resta")
    }
}
