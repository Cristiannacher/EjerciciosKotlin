package pdf_40

import java.util.Arrays
// nada nuevo
fun main(args: Array<String>){
    val numero = 3
    numero.hasta(10)
}

fun Int.hasta(num: Int){
    for(i in this..num){
        print("$i ")
    }
}