package pdf_34

import java.util.Scanner

// en esta practica podemos ver por primera vez las interfaces, estas nos sirver para agrupar una serie de variables y funciones
// de manera que la clase que implemente dicha interfaz va a terner que implementar estas variables o funciones,
// a diferencia que la herencia una clase puede implementar infinitas interfaces

val sc = Scanner(System.`in`)
fun main(args: Array<String>) {
val punto1 = PuntoA(1,2)
val punto2 = PuntoB(1,2)
    punto1.imprimir()
    punto2.imprimir()
}

interface Punto {

    fun imprimir()
}

class PuntoA( var x :Int,var y :Int) : Punto {

    override fun imprimir() {
println("Este punto tiene las cordenadas $x y $y")
    }


}

class PuntoB( var x :Int,var y :Int) : Punto {

    override fun imprimir() {
        println("Cordenada x = $x, cordenada y = $y")
    }


}