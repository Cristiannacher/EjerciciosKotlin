package pdf_38

// en esta practica podemos ver como tenemos distintas funcionalidades a la hora de utilizar un array, como en el ejemplo
// que cren un objeto array rellenandolo de numeros aleatorios esto utilizando una expresion lambda, despues tambien podemos
// ver nuevas funciones como count all any que son muy utiles para ahorrar codigo

fun main(args: Array<String>) {
    var vector = IntArray(20) {(Math.random() * 11).toInt()}
    println("Listado completo del array")
    for(elemento in vector)
        print("$elemento ")
    println()
    val cant1 = vector.count { it <= 5}
    println("Cantidad de elementos menores o iguales a 5: $cant1")
    if (vector.all {it <= 9})
        println("Todos los elementos son menores o iguales a 9")
    else
        println("No todos los elementos son menores o iguales a 9")
    if (vector.any {it == 10})
        println("Al menos uno de los elementos es un 10")
    else
        println("Todos los elementos son distintos a 10")
}