package pdf_24

// en este ejercici podemos ver como tenemos la opcion de poner un constructor a la hora de crear la clase, de esta forma
// no tenemos que inicializar las variables luego

fun main(args: Array<String>) {
    val persona1 = Persona("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
}

class Persona constructor(nombre: String, edad: Int) {
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir() {
        println("Mi nombre es $nombre y mi edad es $edad años")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("$nombre es mayor de edad")
        else
            println("$nombre no es mayor de edad")
    }
}

