package pdf_28

// nada nuevo
fun main(args: Array<String>) {
    val dado1 = Dado(7)
    dado1.imprimir()
    dado1.tirar()
    dado1.imprimir()

}

class Dado(valor: Int) {
    var valor = 0
        set(valor) {
            if (valor >= 1 && valor <= 6)
                field = valor
            else
                field = 1
        }

    init {
        this.valor = valor
    }

    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir() = println("Valor del dado: $valor")
}
