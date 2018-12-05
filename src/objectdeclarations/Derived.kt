package objectdeclarations

class Derived(ba: Base) : Base by ba


fun main(args: Array<String>) {
    val base = BaseImpl(2)
    Derived(base).print()
}