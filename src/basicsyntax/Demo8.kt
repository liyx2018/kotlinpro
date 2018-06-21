package basicsyntax

fun main(args: Array<String>) {
    println("------when 表达式-------------------")
    //when 表达式
    println(describe(1))
    println(describe("haha"))
    println(describe(522L))
    println(describe(false))
    println("--------in 操作符检查范围-----------------")
    var a = 5
    var b = 4
    if (a in 1..b + 1) {
        println("a在范围内")
    }
    println("--------使用 in 操作符检查集合中是否包含某个对象-----------------")
    val items = listOf("orange", "apple", "banana")
    when {
        "durian" !in items -> print("榴莲")
        "orange" in items -> print("orange")
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "one"
            is String -> "是string类型"
            is Long -> "是long类型"
            else -> {
                "其他类型"
            }
        }

