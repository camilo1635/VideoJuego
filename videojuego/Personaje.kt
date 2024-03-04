package videojuego

abstract class Personaje(val nombre: String) {
    protected var vida: Int = 1000
    protected var escudo: Boolean = false
    var resistencia: Int = 100
    protected var posX: Int = 0
    protected var posY: Int = 0


    protected open fun transportar(destinoX: Int, destinoY: Int) {
        posX = destinoX
        posY = destinoY
    }

    fun estaProtegido(): Boolean {
        return escudo
    }

    protected open fun moverEnX(distancia: Int) {
        posX += distancia
    }

    protected open fun moverEnY(distancia: Int) {
        posY += distancia
    }

    fun modificarVida(incremento: Int) {
        val nuevaVida = vida + incremento
        if (nuevaVida > 1000) {
            vida = 1000
        } else if (nuevaVida < 0) {
            vida = 0
        } else {
            vida = nuevaVida
        }


        if (nuevaVida in 0..1000) {
            vida = nuevaVida
        }

    }

    fun estadoVida(): Unit {
        when (vida) {
            in 800..1000 -> println("Estado de vida excelente")
            in 500..800 -> println("Estado de vida bueno")
            in 200..500 -> println("Estado de vida débil")
            in 1..200 -> println("Estado de vida crítico")
            in 0..0 -> println("You die")
        }
    }

    fun quitarEscudo() {
        escudo = false

    }

    fun ponerEscudo() {
        escudo = true
    }

    fun imprimirPersonaje(): String {
        return "Nombre $nombre, vida $vida, escudo $escudo, Posicion ($posX, $posY)"
    }


}