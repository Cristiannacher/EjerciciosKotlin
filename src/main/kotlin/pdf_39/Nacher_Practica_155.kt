package pdf_39

// nada nuevo
fun main(args: Array<String>) {
    val personas = arrayOf(
        Persona("ana", 22),
        Persona("juan", 13),
        Persona("carlos", 6),
        Persona("maria", 72)
    )
    println("Listado de personas")
    personas.forEach { it.imprimir() }
    var cant = 0
    personas.forEach {
        if (it.esMayor())
            cant++
    }
    println("Cantidad de personas mayores de edad: $cant")
}

class Persona(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre Edad: $edad")
    }

    fun esMayor() = edad >= 18
}
