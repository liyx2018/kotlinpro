package classesaobjects

//内部类 添加inner关键字
class Outer {

    var name: String = "liyaxi"

    private val bar: Int = 1

    inner class Inner {
        fun foo() {

            val a = this@Outer
            val b = this@Inner
            val c = this

            println("--------------"+bar)
        }
    }

}
