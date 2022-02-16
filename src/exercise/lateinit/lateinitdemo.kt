package exercise.lateinit

val str:String by lazy {
    "liyx"
}

lateinit var st:String

fun main(args: Array<String>) {

    println("val延迟初始化："+str)

    st = "hello"
    if (::st.isInitialized) println("var延迟初始化："+st) else println("var还没初始化")


}