package pdf_28

//en esta practica podmeos ver como cuando creamos varibles dentro de una clase tenmos disponibles los metodos get y set
// que nos sirven para poner o coger el valor de dicha variable, (he usado field como en el ejemplo porque poniendo nombre da erro pero no se porque)

fun main(args: Array<String>) {
    val persona1 = Persona()
    persona1.nombre = "juan"
    persona1.edad = 23
    println(persona1.nombre) // Se imprime: (JUAN)
    println(persona1.edad) // Se imprime: 23
    persona1.edad = -50
    println(persona1.edad) // Se imprime: 0
}

class Persona {
    var nombre = ""
        set(valor) {
            field = valor.toUpperCase()
        }
        get() {
            return "($field)"
        }
    var edad = 0
        set(valor) {
            field = if (valor >= 0)
                valor
            else

                0
        }
}
