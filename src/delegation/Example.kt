package delegation

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

// 委托的类
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, 这里委托了 ${property.name} 属性"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$thisRef 的 ${property.name} 属性赋值为 $value")
    }
}

val hello: String by lazy {
    println("执行")
    "你好"
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "hi"
    println(e.p)
    println(hello)
    println("----------------")
    println(hello)

}