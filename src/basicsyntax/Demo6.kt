package basicsyntax

fun main(args: Array<String>) {
    fun printLength(obj: Any) {
//        println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
//        println("$obj string length is ${getStringLength01(obj) ?: "......错误数据"}" )
        println("$obj string length is ${getStringLength02(obj) ?: "......错误数据"}" )
    }

    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // obj 将会在这个分支中自动转换为 String 类型
        return obj.length
    }

    // obj 在种类检查外仍然是 Any 类型
    return null
}

fun getStringLength01(obj: Any): Int? {
    if (obj !is String) return null
    // obj 在种类检查外仍然是 Any 类型
    return obj.length
}

fun getStringLength02(obj: Any): Int? {
    if (obj is String && obj.length>0){
      return obj.length
    }
    // obj 在种类检查外仍然是 Any 类型
    return null
}