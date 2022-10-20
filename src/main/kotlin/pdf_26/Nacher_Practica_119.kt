package pdf_26

// nada nuevo
fun main(args: Array<String>) {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}

class Dado(var valor: Int) {
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()

        imprimir()
    }

    fun imprimir() {
        println("Has sacadao: $valor")
    }
}

class JuegoDeDados {
    val dado1 = Dado(0)
    val dado2 = Dado(0)
    val dado3 = Dado(0)
    fun jugar() {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("Ganó")
        else
            print("Perdió")
    }
}
