import avion.*

class Aeropuerto(_avion : AvionI){
    val avion : AvionI = _avion

    fun takingOff(){
        println("Despegando -> " + avion.tipo())
    }
}