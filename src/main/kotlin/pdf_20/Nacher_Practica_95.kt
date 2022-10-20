package pdf_20

import java.util.Scanner

// en este ejercicio vemos que podemos poner funciones dentro de otras funciones, esto nos sera util en caso de que queramos
// crear una funcion que solo vamos a usar dentro de otra, por tanto al crearla dentro de esta no nos deja utilizarla
// en otro sitio y por decirlo de alguna manera queda mas claro su uso

fun main(parametro: Array<String>) {
    multiplos2y5()

}

val sc = Scanner(System.`in`)

fun multiplos2y5() {
    fun multiplo(numero: Int, valor: Int): Boolean {
        return numero % valor == 0
    }
    var mult2 = 0
    var mult5 = 0

    for (i in 1..10) {
        print("Pon un valor")
        val valor = sc.nextInt()
        if (multiplo(valor, 2))
            mult2++
        if (multiplo(valor, 5))
            mult5++
    }
    println("Mmúltiplos de 2 : $mult2")
    println("Múltiplos de 5 : $mult5")
}

