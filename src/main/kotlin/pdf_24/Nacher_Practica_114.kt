package pdf_24

// nada nuevo
fun main(args: Array<String>) {
    val alumno1 = Alumno("Claudia", 5)
    alumno1.imprimir()
    alumno1.mostrarEstado()
    val alumno2 = Alumno("Tomas", 4)
    alumno2.imprimir()
    alumno2.mostrarEstado()
}
class Alumno (val nombre: String, val nota: Int){
    fun imprimir() {
        println("El alumno $nombre tiene una nota de $nota")
    }
    fun mostrarEstado () {
        if (nota >= 4)
            println("$nombre se encuentra en estado REGULAR")
        else
            println("$nombre no está REGULAR")
    }
}
