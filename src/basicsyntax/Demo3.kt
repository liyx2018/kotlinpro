package basicsyntax

fun main(args: Array<String>) {
    var a = 1
    val s ="a is $a"
    a= 2
    // 使用表达式作为模板:
    val s2 = "${s.replace("is", "was")}, but now is $a"
    println(s2)

}