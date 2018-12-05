package classesaobjects

class ChildClass : ParentClass(){

    var cook: String = ""
    get() = field.toUpperCase()

    override fun Miss() {
        super.Miss()
    }
}