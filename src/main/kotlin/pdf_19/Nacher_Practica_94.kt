package pdf_19

// nada nuevo respectivo a la practica anterior

fun main(args: Array<String>){

    calcualarTabla(termino = 5, numero = 4)
}
fun calcualarTabla(numero: Int,termino:Int = 10){
    for (i in 0..termino) {
        var mult = numero * i
        println("$numero * $i = $mult")
    }
}