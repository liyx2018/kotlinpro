package classesaobjects

//内部类 添加inner关键字
class Outer {

    var name: String = "liyaxi"

    inner class Inner{
        fun isfool() {
            println(""+name)
        }
    }

}