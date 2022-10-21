package pdf_37

// nada nuevo
fun main(args: Array<String>) {
    val cadena="¿Esto es la prueba 1 o la prueba 2?"
    println("String original")
    println(cadena)
    println("Solo las vocales")
    val resultado1 = filtrar(cadena) {
        it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U'
    }
    println(resultado1)
    println("Solo los caracteres en minúsculas")
    val resultado2 = filtrar(cadena) {
        it in 'a'..'z'
    }
    println(resultado2)
    println("Solo los caracteres no alfabéticos")
    var resultado3 = filtrar(cadena) {
        it !in 'a'..'z' && it !in 'A'..'Z'
    }
    println(resultado3)
}
fun filtrar(cadena: String, fn: (Char) -> Boolean): String {
    val cad = StringBuilder()
    for(ele in cadena)
        if (fn(ele))
            cad.append(ele)
    return cad.toString()

}
