package classesaobjects

class GenericsDemo<T>(t: T) {
    var value = t
    init {
        println("==========="+value)
    }

}

fun main(args: Array<String>) {

    val nata: GenericsDemo<Int> = GenericsDemo<Int>(6)



}