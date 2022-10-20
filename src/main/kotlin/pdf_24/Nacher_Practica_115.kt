package pdf_24

fun main(args: Array<String>) {
    val punto1 = Punto(12, 3)
    println("EL punto1 se encuentra en ${punto1.retornarCuadrante()}")
    val punto2 = Punto(-4, 3)
    println("El punto2 se encuentra en ${punto2.retornarCuadrante()}")
    val punto3 = Punto(-2, -2)
    println("El punto3 se encuentra en ${punto3.retornarCuadrante()}")
    val punto4 = Punto(12, -5)
    println("El punto4 se encunetra en ${punto4.retornarCuadrante()}")
    val punto5 = Punto(0, -5)
    println("El punto5 se encuentra en ${punto5.retornarCuadrante()}")
}
class Punto (val x: Int, val y: Int) {
    fun retornarCuadrante() = when {
        x > 0 && y > 0 -> "Primer cuadrate"
        x < 0 && y > 0 -> "Segundo cuadrante"
        x < 0 && y < 0 -> "Tercer cuadrante"
        x > 0 && y < 0 -> "Cuarto cuadrante"
        else -> "Un eje"
    }
}
