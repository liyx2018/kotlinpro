package reflectforkotlin

fun main(args: Array<String>) {

    println("----------获取Class对象--------------------")
    println("====kotlin类======" + Student::class)
    println("====java类======" + Student::class.java)

    println("========="+isOdd(5))

    val numbers = listOf(1, 2, 3)
    println(numbers.filter( ::isOdd) )

}

fun isOdd(x: Int) = x % 2 !=0
