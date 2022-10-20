package pdf_21

import java.util.Scanner

val sc = Scanner(System.`in`)

fun main(args: Array<String>){
    val sueldos: IntArray
    sueldos = IntArray(5)
    for(i in 0..sueldos.size-1) {
        print("Ingrese sueldo")
        sueldos[i] = sc.nextInt()
    }
    for(i in 0..sueldos.size-1) {
        println(sueldos[i])
    }
}