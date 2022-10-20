package pdf_24

import java.util.Scanner

// nadad nuevo
val sc = Scanner(System.`in`)
fun main(args: Array<String>) {
val triangulo = Triangulo2()

    triangulo.ladomayor()
    triangulo.esEquilatero()
}


class Triangulo2(var lado1: Int, var lado2: Int, var lado3: Int) {

    constructor():this(0,0,0) {
        println("Primer lado")
        this.lado1 = sc.nextInt()
        println("Segundo lado")
        this.lado2 = sc.nextInt()
        println("Tercer lado")
        this.lado3 = sc.nextInt()
    }


    fun ladomayor() {
        println("Lado mayor")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            println("Es un triángulo equilátero")
        else
            println("No es un triángulo equilátero")
    }
}