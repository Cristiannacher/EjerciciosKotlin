package pdf_18

// en este jercicio hemos visto por primera vez que podemos poner parametros con valor por defecto, de esta forma a la
// hora de llamar a la funcion es opcional rellenar ese parametro de forma que podemos hacer funciones mas funcionales

fun main(args: Array<String>) {
    stringSubrrayado("Hola como estas")
    stringSubrrayado("Hola como estas", "_")
}

fun stringSubrrayado(titulo: String, subrayar: String = "") {
    println(titulo)
    if (subrayar.isNotEmpty()) {
        for (i in titulo)
            print(subrayar)
    }
    println()
}

