package pdf_34


// nada nuevo
fun main(args: Array<String>) {
    val cuadrado1 = Cuadrado(10)
    val rectangulo1 = Rectangulo(10, 5)
    cuadrado1.tituloResultado()
    println("Perimetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")
    rectangulo1.tituloResultado()
    println("Perimetro del rectangulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${rectangulo1.calcularSuperficie()}")
}

interface Figura {
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    fun tituloResultado() {
        println("Datos de la figura")
    }
}

class Cuadrado(val lado: Int) : Figura {
    override fun calcularSuperficie(): Int {
        return lado * lado
    }

    override fun calcularPerimetro(): Int {
        return lado * 4
    }
}

class Rectangulo(val base: Int, val altura: Int) : Figura {
    override fun calcularSuperficie(): Int {
        return base * altura
    }

    override fun calcularPerimetro(): Int {
        return (base * 2) + (altura * 2)
    }
}
