package classesaobjects

//一个密封类是可以有子类的，但是所有的子类必须和父类声明在同一个文件中
sealed class SealedDemo

data class Const(val number: Double) : SealedDemo()
data class Sum(val e1: SealedDemo, val e2: SealedDemo) : SealedDemo()
object NotANumber : SealedDemo()

data class Jup(val oo: String): SealedDemo()