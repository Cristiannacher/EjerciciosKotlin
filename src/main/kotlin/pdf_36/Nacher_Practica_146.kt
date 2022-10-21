package pdf_36

// para este ejercicio he cogido el codigo de ejemplo para analizarlo y enternderlo ya que no havia visto nunca lo de las
// funciones de orden superior, por lo que he ententido se basa en una funcion que seria como un poco globar respecto a las
// otras, entoncees a esta le pudes poner como atributo las otras funciones para asi utilizarlas, como se ve en el ejemplo
// de esta forma con la funcion operar puedo utilizar sumar restar multiplicar dividir...

fun main(args: Array<String>) {
    val resu1 = operar(10, 5, ::sumar)
    println("La suma de 10 y 5 es $resu1")

    val resu2 = operar(5, 2, ::sumar)
    println("La suma de 5 y 2 es $resu2")
    println("La resta de 100 y 40 es ${operar(100, 40, ::restar)}")
    println("El producto entre 5 y 20 es ${operar(5, 20, ::multiplicar)}")
    println("La división entre 10 y 5 es ${operar(10, 5, ::dividir)}")
}

fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int {
    return fn(v1, v2)
}

fun sumar(x1: Int, x2: Int) = x1 + x2
fun restar(x1: Int, x2: Int) = x1 - x2
fun multiplicar(x1: Int, x2: Int) = x1 * x2
fun dividir(x1: Int, x2: Int) = x1 / x2
