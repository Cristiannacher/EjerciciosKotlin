package pdf_27


fun main(args: Array<String>) {
    val vector1 = Vector()
    vector1.imprimir()
    vector1.mostrarMayor()
    vector1.mostrarMenor()
}

class Vector {
    private val vec = IntArray(5)

    init {
        cargar()
    }

    private fun cargar() {
        for (i in vec.indices)
            vec[i] = ((Math.random() * 11)).toInt()
    }

    fun imprimir() {
        println("Numeros del array")
        for (i in vec.indices)
            print("${vec[i]} - ")
        println()
    }

    fun mostrarMayor() {
        var mayor = vec[0]
        for (i in vec.indices)
            if (vec[i] > mayor)
                mayor = vec[i]
        println("El numero mayor del array es $mayor")
    }

    fun mostrarMenor() {
        var menor = vec[0]
        for (i in vec.indices)
            if (vec[i] < menor)
                menor = vec[i]
        println("El numero menor del array es $menor")
    }
}
