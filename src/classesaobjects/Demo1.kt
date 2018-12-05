package classesaobjects


//如果构造函数有注解或可见性声明，则 constructor 关键字是不可少的
class Demo1 public constructor(var name: String) {


    //二级构造函数
    constructor(name: String, age: Int) : this(name)

    constructor(name: String, age: Int,address: String) : this(name,age)

    init {
        println("此处代码初始化")
    }

    fun food(age: Int) {
        println("------------------姓名："+name+"年龄："+age)
    }

}
