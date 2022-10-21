package pdf_41

// lo mismo pero con los operadores mayor y menor
fun main(args: Array<String>) {
    val persona1 = Persona("Tomas", 20)
    persona1.imprimir()
    val persona2 = Persona("Pedro", 45)
    persona2.imprimir()
    println("Persona mayor")
    when {
        persona1 > persona2 -> persona1.imprimir()
        persona1 < persona2 -> persona2.imprimir()
        else -> println("Tienen la misma edad")
    }
}

class Persona(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    operator fun compareTo(per2: Persona): Int {
        return when {
            edad < per2.edad -> -1
            edad > per2.edad -> 1
            else -> 0
        }
    }
}
