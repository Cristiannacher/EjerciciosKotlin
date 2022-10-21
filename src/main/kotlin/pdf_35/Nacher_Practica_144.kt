package pdf_35

// nada nuevo
fun main(args: Array<String>) {
    val articulos = arrayOf(
        Articulo(1, "carlotes", 2.3f),
        Articulo(2, "peres", 3.2f),
        Articulo(1, "pomes", 4f),
        Articulo(1, "cebes", 2f)
    )

    println("Listado de precios actual")
    imprimir(articulos)
    aumentarPrecio(articulos)
    println();
    println("Listado de precios con aumento del 10%")
    imprimir(articulos)
}

data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)

fun imprimir(articulos: Array<Articulo>) {
    for (articulo in articulos)
        println("Código: ${articulo.codigo} - Descripción: ${articulo.descripcion} Precio: ${articulo.precio}")
}

fun aumentarPrecio(articulos: Array<Articulo>) {
    for (articulo in articulos)
        articulo.precio += (articulo.precio * 0.10f)
}
