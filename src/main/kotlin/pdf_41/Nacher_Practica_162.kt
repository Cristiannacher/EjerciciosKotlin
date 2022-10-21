package pdf_41

// nada nuevo
fun main(args: Array<String>) {
    val vec1 = Vector2()
    vec1.cargar()
    vec1.imprimir()
    println("La multiplicacion entre el vector y 10 es: ")
    val vectorResultado = vec1 * 10
    vectorResultado.imprimir()
}

class Vector2 {
    val arreglo = IntArray(5)
    fun cargar() {
        for (i in arreglo.indices)
            arreglo[i] = (Math.random() * 11 + 1).toInt()
    }

    fun imprimir() {
        for (elemento in arreglo)
            print("$elemento ")
        println()
    }

    operator fun times(valor: Int): Vector2 {
        var suma = Vector2()
        for (i in arreglo.indices)
            suma.arreglo[i] = arreglo[i] * valor
        return suma
    }
}
