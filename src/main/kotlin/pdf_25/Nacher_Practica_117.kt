package pdf_25

fun main(args: Array<String>) {
    val hijos = Hijos()
    hijos.cargar()
}

class Hijos() {
    val edadesHijos = IntArray(6)
    fun cargar() {
        for (i in edadesHijos.indices) {
            println("Edad del hijo ${i + 1}")
            edadesHijos[i] = sc.nextInt()
        }
        hijoMayor()
        promedioEdades()
    }

    fun hijoMayor(){
        var mayor = edadesHijos[0]
        for(i in edadesHijos.indices)
            if (edadesHijos[i] > mayor)
                mayor = edadesHijos[i]
        println("El hijo con mayor edad es $mayor")
    }

    fun promedioEdades(){
        var media = 0
        for (i in edadesHijos.indices){
            media+= edadesHijos[i]
        }
        println("La media de las edades es ${media/edadesHijos.size}")
    }
}