package basicsyntax

fun main(args: Array<String>) {

    val a: Int = 200
    val b: Int? = a
    val c: Int? = a
    println("比较两个对象的值：${b == c}")
    println("比较两个对象的内存地址：${b === c}")



    println("-------------------array数组----------------------------------------")
    val aa: Array<String> = arrayOf("liyaxi","zhangsan")
    for ((index, value) in aa.withIndex()) {
        println("the element at $index is $value")
    }



    arrayOfNulls<String>(5)


    val asc = Array(5, {i -> (i * i).toString() })
    for (item in asc){
        println("数组："+item)
    }

}