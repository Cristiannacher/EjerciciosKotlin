package pdf_40

// en este ejemplo he descubierto que el it en una array nos permite rellenarla de enteros del 0 al largo del array
fun main (args: Array<String>){

    val arreglo1= IntArray(10, {it})
    arreglo1.impirmirUnaLinea()
}

fun IntArray.impirmirUnaLinea() {
this.forEach { print("$it ") }
}