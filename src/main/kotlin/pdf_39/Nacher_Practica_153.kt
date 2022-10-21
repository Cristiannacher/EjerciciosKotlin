package pdf_39

// en esta practica vemos como podemos acceder a las variables externas en este caso el array, con expresiones lambda,usando
// it

fun main(args: Array<String>) {
    var vector = IntArray(10) { (Math.random() * 99).toInt() }

    println("Array completo")
    for (i in vector)
        print("$i-")
println()
    println("Multiplos de 3")
    funcion1(vector) {
        if (it % 3 == 0)
            print("$it-")
    }
    println()
    println("Suma de los numero mayores a 50")
    var suma = 0
    funcion1(vector) {

        if (it > 50)
            suma += it
    }
    println(suma)
}

fun funcion1(vector: IntArray, fn: (Int) -> Unit) {
    for (num in vector)
        fn(num)
}