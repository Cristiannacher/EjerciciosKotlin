package pdf_41

// en este ejemplo se nos muestra la sobrecarga de operadores, como podemos ver creamos funciones dentro de la clase
// Vector de forma que luego podemos operar objetos de esta clase con los signos + - / *
// basicamente le estamos diciendo al objeto como actuar ante esos signos

fun main(args: Array<String>) {
    val vec1 = Vector()
    vec1.cargar()
    val vec2 = Vector()
    vec2.cargar()
    vec1.imprimir()
    vec2.imprimir()

    val vecSuma = vec1 + vec2
    println("Suma componente a componente de los dos vectores")
    vecSuma.imprimir()
    val vecResta = vec1 - vec2
    println("La resta componente a componente de los dos vectores")
    vecResta.imprimir()
    val vecProducto = vec1 * vec2
    println("El producto componente a componente de los dos vectores")
    vecProducto.imprimir()
    val vecDivision = vec1 / vec2
    println("La división componente a componente de los dos vectores")
    vecDivision.imprimir()
}

class Vector {
    val array = IntArray(5)
    fun cargar() {
        for (i in array.indices)
            array[i] = (Math.random() * 11 + 1).toInt()
    }

    fun imprimir() {
        for (elemento in array)
            print("$elemento ")

        println()
    }

    operator fun plus(vector2: Vector): Vector {
        var suma = Vector()
        for (i in array.indices)
            suma.array[i] = array[i] + vector2.array[i]
        return suma
    }

    operator fun minus(vector2: Vector): Vector {
        var resta = Vector()
        for (i in array.indices)
            resta.array[i] = array[i] - vector2.array[i]
        return resta
    }

    operator fun times(vector2: Vector): Vector {
        var producto = Vector()
        for (i in array.indices)
            producto.array[i] = array[i] * vector2.array[i]
        return producto
    }

    operator fun div(vector2: Vector): Vector {
        var division = Vector()
        for (i in array.indices)
            division.array[i] = array[i] / vector2.array[i]
        return division
    }
}
