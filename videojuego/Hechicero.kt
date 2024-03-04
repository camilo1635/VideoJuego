package videojuego

class Hechicero(nombreHechicero:String):Personaje(nombreHechicero) {
    private var magia = 30

    fun modificarFuerza(incremento:Int){
        val nuevaMagia = magia+incremento
        if (nuevaMagia>30){
            magia = 30
        }else if (nuevaMagia <0){
            magia = 0
        }else{
            magia = nuevaMagia
        }

        if (nuevaMagia in 0..30){
            magia = nuevaMagia
        }
    }

    fun curar(amigo:Personaje){
        amigo.modificarVida(magia)
    }
}