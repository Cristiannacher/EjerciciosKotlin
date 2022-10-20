package pdf_18

// ninguna novedad respecto a la practica anterior

fun main(args: Array<String>) {
  println(sumarValores(1,2,3,4,5))
    println(sumarValores(1,2))
}

fun sumarValores(num1: Int, num2: Int, num3: Int = 0,num4: Int = 0,num5: Int = 0,): Int {
return num1+num2+num3+num4+num5
}
