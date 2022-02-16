package exercise.higherorderfunction

fun main(args: Array<String>) {
    val nums =getNum(12,15,::plus)
    println("两数相加："+nums)

    getNum(10,12){num1,num2 -> num1+num2}

}

fun getNum(num1:Int,num2:Int,fuc:(Int,Int) -> Int):Int{
    return fuc(num1,num2)
}

fun plus(num1:Int,num2:Int):Int{
    return num1+num2
}
fun minus(num1:Int,num2:Int):Int{
    return num1-num2
}