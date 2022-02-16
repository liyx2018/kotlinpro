package exercise.operator

fun main(args: Array<String>) {

    val money1 = Money(10)
    val money2 = Money(20)

    val money3 = money1+24
    println("对象+数字："+money3.value)

    val money4 = money1+money2
    println("对象+对象："+money4.value)




}