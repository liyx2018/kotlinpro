package yj

class C() : A(), B {

    override fun f() {
        super<A>.f()
        super<B>.f()
    }

}