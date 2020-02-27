import avion.Avioneta
import avion.Jet
import carro.*
import carroAbs.*

fun ejecCarro(){
    println("\n***** Metodos con herencia")
    var carrito = Carro();
    carrito.tipo()
    carrito =  SUV()
    carrito.tipo()
    carrito =  Sedan()
    carrito.tipo()
}

fun ejecCarroAbs(){
    println("\n***** Metodos con clases y metodos abstractos")
    var carrito : CarroA
    carrito = Sedan_A()
    carrito.imprimir()
    carrito =  SUV_A()
    carrito.imprimir()
}

fun ejecAeropuerto(){
    println("\n***** Metodos con interfaces")
    var airport : Aeropuerto = Aeropuerto(Jet())
    airport.takingOff()
    airport = Aeropuerto(Avioneta())
    airport.takingOff()
}

fun main(){
    println("Hola mundo")
    ejecCarro()
    ejecCarroAbs()
    ejecAeropuerto()
    println("\nFIN")
}