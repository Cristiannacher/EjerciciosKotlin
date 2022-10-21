package pdf_36


fun main(args: Array<String>) {
    val personas = arrayOf(
        Persona("Pedro", 20),
        Persona("Tomas", 30)
    )

for(persona in personas) {
    if (persona.esMayor(::mayorArgentina))
        println("${persona.nombre} es mayor de edad si vive en Argentina")
    else
        println("${persona.nombre} no es mayor de edad si vive en Argentina")
    if (persona.esMayor(::mayorEstadosUnidos))
        println("${persona.nombre} es mayor de edad si vive en Estados Unidos")
    else
        println("${persona.nombre} no es mayor de edad si vive en Estados Unidos")
}
}

class Persona(val nombre: String, val edad: Int) {
    fun esMayor(fn: (Int) -> Boolean): Boolean {
        return fn(edad)
    }
}

fun mayorEstadosUnidos(edad: Int): Boolean {
    return edad >= 21
}

fun mayorArgentina(edad: Int): Boolean {
    return edad >= 18
}
