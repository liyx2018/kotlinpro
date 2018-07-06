package classesaobjects

//枚举01 抽象方法与匿名内部类
enum class EnumDemo() {

    //初始化
    STUDENT() {
        override fun getPerson(ordinal: Int): EnumDemo {
            return EnumDemo.values()[ordinal]
        }
    },
    GREEN() {
        override fun getPerson(ordinal: Int): EnumDemo {
            return EnumDemo.values()[ordinal]
        }

    },
    BLUE() {
        override fun getPerson(ordinal: Int): EnumDemo {
            return EnumDemo.values()[ordinal]
        }
    };

    abstract fun getPerson(ordinal: Int): EnumDemo
}

fun main(args: Array<String>) {

    val per = EnumDemo.STUDENT
    println("getPerson:${per.getPerson(0)}")

}