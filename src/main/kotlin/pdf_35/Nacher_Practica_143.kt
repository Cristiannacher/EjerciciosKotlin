package pdf_35

// en este ejercicio podemos ver como dentro de un array tambien podemos almacenar objetos enteros
fun main(args: Array<String>) {
    val personas = arrayOf(
        Persona("Pepe", 52),
        Persona("juan", 15),
        Persona("Tomas", 34),
        Persona("Ana", 5)
    )
    println("Listado de personas")
    var cant = 0
    for (per in personas) {
        per.imprimir()
        if (per.esMayor())
            cant++
    }

    println("Cantidad de personas mayores de edad: $cant")
}

class Persona(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre Edad: $edad")
    }

    fun esMayor() = if (edad >= 18) true else false
}
