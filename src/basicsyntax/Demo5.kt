package basicsyntax

fun main(args: Array<String>) {

    println("--------------------------安全调用 ?.-------------------------------------------------")
    //安全调用 ?. 如果 name 不为空则返回长度，否则返回空
    var name: String? = null
    println("==========" + name?.length)



    println("--------------------------Elvis操作符?:-------------------------------------------------")
    var a:String? = null
    //Elvis操作符,?:左边的返回值不为空则返回，否则返回？：右边的值
    var len = a?.length?: -1
    println("=========================="+len)

    println("-----长度---------${foo("Kotlin")}")





    println("--------------------------非空断言!!.-------------------------------------------------")
    //非空断言!!. 对象为null时，会抛空指针  一般不建议使用
    var age: String? = "hello"
    println(age!!.length)




    println("--------------------------安全转换 as?-------------------------------------------------")
    //安全转换 as?，如果不成功就返回空
    var alho: String? ="alho"
    val aInt: Int? = alho as? Int
    println(aInt)

}

fun foo(node: String): Int? {
    val parent = node.length ?: return null
    return parent
}


fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}
