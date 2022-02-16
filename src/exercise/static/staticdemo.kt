package exercise.static

fun doSth(){
    println("静态-顶层方法")
}

object StaticDemo{

    fun dosth(){
        println("静态-单例方法")
    }
}

class StaticDemo1{
    companion object{
        fun dosth(){
            println("伴生对象-单例方法")
        }
    }
}


