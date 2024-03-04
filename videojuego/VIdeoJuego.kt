package videojuego

fun main() {
    println("************** Inicio del juego TTM**************")

    val guerrero1 = Guerrero("Atreyu")
    val hechicero = Hechicero("Merlin")
    val guerrero2 = Guerrero("goku")
    val hechicero2 = Hechicero("kakaroto")

    //ataques
    guerrero1.ataqueBasico(0, guerrero2)
    guerrero1.ataqueNormal(0, guerrero2)
    guerrero1.ataqueEspecial(0, guerrero2)

    //ataque aleatorio
    guerrero1.ataqueAleatorio(guerrero2)
    println("Despues del ataque")
    println(guerrero2.imprimirPersonaje())

    //estado de vida actual
    println(guerrero2.estadoVida())
    println("/////////////////////")
    hechicero.curar(guerrero2)
    println("Despues de curar")
    println(guerrero2.imprimirPersonaje())
    println(guerrero2.estadoVida())

    //cambio de posiciones
    guerrero2.moverEnX(5)
    guerrero2.moverEnY(2)
    println("/////////////////////")
    println("Despues de moverse")
    println(guerrero2.imprimirPersonaje())
    println(guerrero2.estadoVida())
    println("/////////////////////")

    //ataques con incremento
    guerrero2.ataqueNormal(30, guerrero1)
    //guerrero2.ataqueBasico(10,guerrero1)
    println(guerrero1.imprimirPersonaje())

}