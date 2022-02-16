package exercise

/**
 * 内置函数的使用
 */
class standarddemo {


    fun letFunction(){
       val name:String = "learn"
       val newName = name?.let {
           it.length
           it.toString()
       }
       println(newName)
    }

    fun withFunction(){
        val stu = Student(name = "kotlin",age = 12)
        with(stu){
            println("my name is $name,age is $age")
        }
    }

    fun runFunction(){
        val stu = Student(name = "kotlin",age = 12)
        stu?.run {
            println("my name is $name,age is $age")
        }
    }

    fun alsoFunction(){
       val sb = StringBuffer()
       val s =sb.also {
           it.append("learn")
           it.append("kotlin")
           it.append(19)
       }
        println("also 打印的：$s")
    }

    fun applyFunction(){
        val stu = Student(name = "kotlin",age = 12)
        val s =stu?.apply {
            println("my name is $name,age is $age")
        }
        println("apply 打印的：$s")
    }

}

fun main(args: Array<String>) {

    val standardDemo = standarddemo()
    println("------let---------------------")
    //let  返回最后一行
    standardDemo.letFunction()
    println("------with---------------------")
    //with 返回最后一行 省去对象名重复
    standardDemo.withFunction()
    println("------run---------------------")
    //run 返回最后一行 省去对象名重复 可以判空
    standardDemo.runFunction()

    println("------also---------------------")
    //also 返回对象本身
    standardDemo.alsoFunction()
    println("------apply---------------------")
    //apply 返回对象本身 省去对象名重复
    standardDemo.applyFunction()

}

data class Student(val name:String,val age:Int)