package objectdeclarations

class DelegateLazyClass {


    inner class Hello{

        fun Int.foo(){

            val a = this@DelegateLazyClass
            val b = this@Hello

            val c = this@foo

        }

    }


}