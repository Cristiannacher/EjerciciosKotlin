package pdf_35

// nada nuevo
fun main(args: Array<String>) {
    var dados = arrayOf(Dado(), Dado(), Dado(), Dado(), Dado())
    for(dado in dados) {
        dado.tirar()
        dado.imprimir()
    }
}
class Dado (var valor: Int = 1){
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }
    fun imprimir() {
        println("Ha salido: $valor")
    }
}
