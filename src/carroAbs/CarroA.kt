package carroAbs

open abstract class CarroA {

    abstract fun tipo():String

    final fun imprimir(){
        println("Carro tipo - > " + tipo())
    }
}