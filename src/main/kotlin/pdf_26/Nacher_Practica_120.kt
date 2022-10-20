package pdf_26


// nadad nuevo
fun main(args: Array<String>) {
    val club1 = Club()
    club1.masAntiguo()
}

class Socio (val nombre: String, val antiguedad: Int) {

    fun imprimir() {
        println("$nombre tiene una antiguedad de $antiguedad")
    }
}
class Club {
    val socio1 = Socio("Juan", 32)
    val socio2 = Socio("Tomas", 37)
    val socio3 = Socio("Carlos", 23)
    fun masAntiguo() {
        socio1.imprimir()
        socio2.imprimir()
        socio3.imprimir()
        print("Socio con mayor antiguedad: ")
        when {
            socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad ->
                print(socio1.nombre)
            socio2.antiguedad > socio3.antiguedad -> print(socio2.nombre)
            else -> print(socio3.nombre)
        }
    }
}
