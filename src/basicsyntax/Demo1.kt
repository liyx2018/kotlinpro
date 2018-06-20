package basicsyntax

fun main(args: Array<String>) {
    println("a+b=${sum(5, 5)}")
    println("a+b=${sum1(15, 5)}")
    sum2(25,3)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

//返回一个没有意义的值类型Unit，可以省略掉Unit
fun sum2(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+b}")
}