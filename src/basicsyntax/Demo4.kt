package basicsyntax
//条件表达式
fun main(args: Array<String>) {
    println("a and b maxValue is ${max(5,3)}")
    println("a and b mimValue is ${min(10,12)}")
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun min(a: Int, b: Int) = if (a<b) a else b