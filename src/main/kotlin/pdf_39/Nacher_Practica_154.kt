package pdf_39

// en esta practica hemos visto la nueva funcion forHeach de los vectores, que antes realizavamos con un for
fun main(args: Array<String>) {
    var vector = IntArray(10) { (Math.random() * 99).toInt() }

    println("Array completo")
    for (i in vector)
        print("$i-")
    println()
    println("Multiplos de 3")
    vector.forEach {
        if (it % 3 == 0)
            print("$it-")
    }

    println()
    println("Suma de los numero mayores a 50")
    var suma = 0
    vector.forEach {
        if (it > 50)
            suma+=it
    }
    println(suma)
}

