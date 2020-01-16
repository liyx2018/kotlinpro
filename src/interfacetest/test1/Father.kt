package interfacetest.test1

/**
 * 接口可以从其他接口派生
 */
interface Father: Grandpa {

    //抽象的
    val port: Int

    val name: String
        get() = "liyaxi"

    fun bar()

    fun sparrow(){
        // 可选的方法体
    }

}