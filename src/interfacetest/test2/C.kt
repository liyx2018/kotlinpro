package interfacetest.test2

/**
 * 实现多个接口时，可能会遇到同一方法继承多个实现的问题
 */
class C : A,B{

    override fun bar() {
        super<A>.bar()
    }

    override fun network() {
        super<A>.network()
        super<B>.network()
    }

}