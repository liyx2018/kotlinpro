package objectdeclarations

class objectdemo {

}

//对象表达式 object声明一个对象
fun main(args: Array<String>) {
    //对象表达式
    val site = object {
        var name: String = "北京上海"
    }

    val addr = object {
        var age: Int = 19
    }

    val hi = object {

        var ho: Boolean = false
    }

    println("===打印==="+hi.ho + site.name + "======年龄${addr.age}")
}