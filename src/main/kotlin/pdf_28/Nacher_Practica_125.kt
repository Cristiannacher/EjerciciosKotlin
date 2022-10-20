package pdf_28

// nada nuevo
fun main(args: Array<String>) {
    val empleado1 = Empleado("Juan", 2345.0)
    empleado1.imprimir()
    val empleado2 = Empleado("Ana", -1000.0)
    empleado2.imprimir()
}

class Empleado(var nombre: String, sueldo: Double) {
    var sueldo = 0.0
        set(valor) {
            if (valor < 0)
                field = 0.0
            else
                field = valor
        }

    init {
        this.sueldo = sueldo
    }

    fun imprimir() {
        println("$nombre tiene un sueldo de $sueldo")
    }
}
