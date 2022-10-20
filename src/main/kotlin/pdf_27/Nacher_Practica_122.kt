package pdf_27

// tambien podemos ver como podemos hacer una funcion privada que, como hemos dicho antes solo podremos utilizar dentro
// de la clase donde la hayamos creado
fun main(args: Array<String>) {
    val dado1 = Dado()
    dado1.tirar()
    dado1.imprimir()

}

class Dado {
    private var valor = 0
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir() {
        separador()
        println("Valor del dado: $valor")
        separador()
    }

    private fun separador() = println("**************************************")
}
