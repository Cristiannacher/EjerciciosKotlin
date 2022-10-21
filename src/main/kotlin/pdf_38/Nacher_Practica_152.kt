package pdf_38

import java.util.Scanner

// nada nuevo

val sc = Scanner(System.`in`)
fun main(args: Array<String>) {
    val vector = FloatArray(10)
    for(i in vector.indices) {
        print("Ingrese elemento:")
        vector[i] = sc.nextFloat()
    }
    println("Todos los numero del vector")
    for(numero in vector)
        print("$numero ")
    println()
    val cant = vector.count { it < 50}
    println("Numeros menores a 50: $cant")
    if (vector.all {it < 50})
        println("Todos lso numeros son menores a 50")
    else
        println("No todos los numeros son menores a 50")
}