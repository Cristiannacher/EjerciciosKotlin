package pdf_37

// nada nuevo el ejemplo nos muestra como con las expresiones lambda, de una funcion podemos sacar diversos usos
fun main(args: Array<String>) {
    val vector1 = IntArray(10)
    for (i in vector1.indices)
        vector1[i] = ((Math.random() * 100)).toInt()
    println("Imprimir los múltiplos de 2")
    imprimirSi(vector1) { x -> x % 2 == 0 }
    println("Imprimir los múltiplos de 3 o de 5")
    imprimirSi(vector1) { x -> x % 3 == 0 || x % 5 == 0 }

    println("Imprimir los numeros mayores o iguales a 50")
    imprimirSi(vector1) { x -> x >= 50 }
    println("Imprimir los numeros entre 1 y 10, 20 y 30, 90 y 95")
    imprimirSi(vector1) { x ->
        when (x) {
            in 1..10 -> true
            in 20..30 -> true
            in 90..95 -> true
            else -> false
        }
    }
    println("Imprimir todos los numeros")
    imprimirSi(vector1) { x -> true }
}

fun imprimirSi(vector: IntArray, fn: (Int) -> Boolean) {
    for (elemento in vector)
        if (fn(elemento))
            print("$elemento ")
    println();
}
