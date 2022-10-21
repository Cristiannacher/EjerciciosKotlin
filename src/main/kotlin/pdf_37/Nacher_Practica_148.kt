package pdf_37

//por lo que he entendindo de las experesiones lambda, vendria siendo que cuando tenemos una funcion de orden superior que
// tiene como parametro otra funcion, a la hora de utilizarla en vez de pasarle la funcion la imiplementamos en el momento
// como podemos observar en el ejemplo

fun main(args: Array<String>) {
    val suma = operar(2, 3) { x, y -> x + y }
    println(suma)
    val resta = operar(12, 2) { x, y -> x - y }
    println(resta)
    var elevarCuarta = operar(2, 4) { x, y ->
        var valor = 1
        for (i in 1..y)
            valor *= x
        valor
    }
    println(elevarCuarta)
}

fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int{
    return fn(v1, v2)
}
