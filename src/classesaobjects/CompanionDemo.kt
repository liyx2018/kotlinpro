package classesaobjects

//Kotlin伴随对象的使用
class CompanionDemo {

    init {
        println("---init初始化---" )
    }

    companion object Factory{
        fun create(): CompanionDemo = CompanionDemo()

        val name: String = "姓名"

    }


}

fun main(args: Array<String>) {

    CompanionDemo.create()


    println("--------------" + CompanionDemo.name)


}