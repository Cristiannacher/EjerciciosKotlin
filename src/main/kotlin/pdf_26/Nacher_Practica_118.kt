package pdf_26


// en este ejercicio podemos ver la "Colaboracion de clases", basicamente vemos como podemos utilizar clases dentro de otras
// clases de forma que empezamos a poder hacer programitas mas elaborados

fun main(args: Array<String>) {
    val banco1 = Banco()
    banco1.operar()
    banco1.depositosTotales()
}

class Cliente(var nombre: String, var dinero: Float) {
    fun depositar(dinero: Float) {
        this.dinero += dinero
    }

    fun extraer(dinero: Float) {
        this.dinero -= dinero
    }

    fun imprimir() {
        println("$nombre tiene depositado la suma de $dinero")
    }
}

class Banco {
    val cliente1 = Cliente("Juan", 0f)
    var cliente2 = Cliente("Ana", 0f)
    var cliente3 = Cliente("Luis", 0f)
    fun operar() {
        cliente1.depositar(104f)
        cliente2.depositar(650f)
        cliente3.depositar(430f)
        cliente3.extraer(250f)
        cliente1.extraer(12f)
        cliente2.extraer(12f)
        cliente3.extraer(12f)
    }

    fun depositosTotales() {
        val total = cliente1.dinero + cliente2.dinero + cliente3.dinero
        println("El total de dinero del banco es: $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}
