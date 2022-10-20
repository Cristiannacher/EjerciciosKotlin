package pdf_20

import java.util.Scanner


// nada nuevo

fun main(args: Array<String>) {

}

fun numeroMayor() {
    fun mayor(num1: Int, num2: Int) : Int {
        return if(num1>num2) num1 else num2
    }
    for (i in 1..5) {
        print("Primer valor")
        val valor1 = sc.nextInt()
        print("Segundo Valor")
        val valor2 = sc.nextInt()
        println("El mayor entre $valor1 y $valor2 es ${mayor(valor1, valor2)}")
    }

}
