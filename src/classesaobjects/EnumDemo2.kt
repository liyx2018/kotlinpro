package classesaobjects

//枚举 枚举类和接口
enum class EnumDemo2 : IClickListener {


    ONE {
        override fun onclick() {
            println("----------one-------")
        }

    },
    TWO {
        override fun onclick() {
            println("----------two-------")
        }
    },
    THREE {
        override fun onclick() {
            println("----------three-------")
        }
    };

}


fun main(args: Array<String>) {
    val rel=EnumDemo2.ONE
    println("打印${rel.onclick()}")
}