package videojuego

class Guerrero(nombreGuerrero: String) : Personaje(nombreGuerrero) {
    private var normal = 60
    private var especial = 200
    private var basico = 20

    fun ataqueNormal(incremento: Int, enemigo: Personaje): Boolean {
        val nuevaFuerza = normal + incremento
        if (nuevaFuerza > 80) {
            normal = 80
        } else if (nuevaFuerza < 80) {
            normal = 60
        } else {
            normal = nuevaFuerza
        }

        if (nuevaFuerza in 0..80) {
            normal = nuevaFuerza
        }

        if (enemigo.estaProtegido())
            return false
        enemigo.modificarVida(-normal)
        return true
    }

    fun ataqueEspecial(incremento: Int, enemigo: Personaje): Boolean {
        val nuevaFuerza = especial + incremento
        if (nuevaFuerza > 200) {
            especial = 200
        } else if (nuevaFuerza < 200) {
            especial = 200
        } else {
            especial = nuevaFuerza
        }

        if (nuevaFuerza in 0..200) {
            especial = nuevaFuerza
        }

        if (enemigo.estaProtegido())
            return false
        enemigo.modificarVida(-especial)
        return true
    }

    fun ataqueBasico(incremento: Int, enemigo: Personaje): Boolean {
        val nuevaFuerza = basico + incremento
        if (nuevaFuerza > 30) {
            basico = 30
        } else if (nuevaFuerza < 30) {
            basico = 20
        } else {
            basico = nuevaFuerza
        }

        if (nuevaFuerza in 0..30) {
            basico = nuevaFuerza
        }

        if (enemigo.estaProtegido())
            return false
        enemigo.modificarVida(-basico)
        return true

    }


    fun ataqueAleatorio(enemigo: Personaje) {

        val ataques = listOf(::ataqueBasico, ::ataqueNormal, ::ataqueEspecial)

        val ataqueElegido = ataques.random()
        ataqueElegido(0, enemigo)

    }

    public override fun moverEnX(distancia: Int) {
        posX += distancia
        vida -= distancia * 2
    }

    public override fun moverEnY(distancia: Int) {
        posY += distancia
        vida -= distancia * 2
    }

}