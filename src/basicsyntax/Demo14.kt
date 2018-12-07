package basicsyntax

/**
 * 运算符重载
 */
class Demo14 {
}

fun main(args: Array<String>) {

    val list = arrayListOf("jack","lily")
    list += "oo"
    list += "opp"
    list.println()
}

fun Any.println() {
    println(this)
}

