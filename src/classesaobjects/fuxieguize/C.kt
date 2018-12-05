package classesaobjects.fuxieguize

class C() : A() , B {
    // 编译器会要求复写f()
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}