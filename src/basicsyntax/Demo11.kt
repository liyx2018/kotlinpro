package basicsyntax

class Demo11 {


}

/**
 * 解构声明
 */


//数据类data class   主构造函数必须包含一个参数，且标识为val或var  可以声明为 abstract, open, sealed 或者 inner  不能继承其他类 (但是可以实现接口)
data class Person(var name: String,var age: Int)

fun main(args: Array<String>) {

    //数据类使用



    //----------第一种用法--------------
   var (name,age )=Person("liayxi",20)
    println("---${name}------${age}---")

    //----------第二种用法---循环-----------
   val list: List<Person> = listOf(Person("liayxi",20),Person("zhangsan",26),Person("wangwu",50))
    list.forEach { (key,value) ->
      println("key:$key   value:$value")
    }

    //----------第三种用法---函数-----------
   val(s,a) = getPair("jack",null)
    println("'s:'$s  'a:'$a")

    //----------第四种用法---map-----------
    val map: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    map.forEach { (key,value)->
        println("$key=$value")
    }

    //------第五种用法---------如果在解构声明中有用不到的变量，则可以使用下划线代替------
    val (_,ge)=getPair("jesse",23)
    println("ge:"+ge)



}

fun getPair(after: String?, afterAge: Int?): Pair<String, Int> {
    var name = "liyaxi"
    var age = 18
    // 处理返回的数据
    name = after ?: name
    age = afterAge ?: age
    return Pair(name, age)
}
