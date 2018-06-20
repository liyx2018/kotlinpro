package basicsyntax

fun main(args: Array<String>) {
    var d: String? = "moji"
    d =null
    val len1: Int = if (d!=null) d.length else -1


    var a: String? = "das"
    a =null
    val len = a !!.length
    println("字符串的长度："+len)
}