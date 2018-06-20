package basicsyntax

fun main(args: Array<String>) {
    //for循环
    val  items = listOf("apple","orange","bnana")
    println("-----item in items----------------------")
    for (item in items){
        println("集合元素："+item)
    }
    println("-----item: String in items----------------------")
    for (item: String in items) {
        println("集合元素："+item)
    }
    println("-----index in items.indices---------------------")
    for (index in items.indices){
        println("元素:item at $index is ${items[index]}")
    }
    println("------i in 1..3---------------------")
    for (i in 1..3) {
        println(i)
    }
    println("------i in 6 downTo 0 step 2---------------------")
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
    println("------(index, value) in array.withIndex()---------------------")
    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }
    //While循环



}