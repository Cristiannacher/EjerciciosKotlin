package pdf_40

// con este ejemplo podemos observar como boin dice en los apuntes podemos agregar funciones a una clase ya creada en este caso
// la clase String, para ello tenemos que crear la funcion con la sentencia fun String.nombre de la funcion

fun main(args: Array<String>) {
    val cadena1 = "Sanpedrobenedicto"
    println(cadena1.primeraMitad())
    println(cadena1.segundaMitad())
}

fun String.primeraMitad(): String {
    return substring(0..this.length / 2 - 1)
}

fun String.segundaMitad(): String {
    return substring(this.length / 2..this.length - 1)
}
