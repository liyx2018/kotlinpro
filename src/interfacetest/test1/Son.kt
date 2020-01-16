package interfacetest.test1

class Son : Father {
    override val firstName: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
    override val port: Int
        get() = 12

    override fun bar() {
        println("展示出来："+port+"----"+name)
    }


}

fun main(args: Array<String>) {

     val son = Son()
     son.bar()

}