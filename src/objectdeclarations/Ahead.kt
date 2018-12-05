package objectdeclarations

class Ahead {

    inner class Bhead {

        fun Int.fool() {
            var a = this@Ahead
            var b = this@Bhead

            var c= this
            var c1= this@fool

        }
    }


}