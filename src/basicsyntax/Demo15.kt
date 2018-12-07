package basicsyntax

class Demo15 {
}


fun main(args: Array<String>) {
    val list: MutableList<String> = mutableListOf("apple", "orange")
    val change: Any

    //在let中，用it表示引用对象，并可调用其方法，it不可省略。
    //返回值是语句块的最后一行，若最后一行语句无返回值，则整个let语句块也无返回值
//    change = list.let {
//        it += "banana"
//        it += "suger"
//        it.size
//    }


    //在apply中，用this代表当前引用对象，并且调用其方法时，this可省略。
    //apply必有返回值，且返回值是当前引用对象
//    change = list.apply {
//        add("hello")
//        this.add("world")
//        size
//    }

    //在run中，用this代表当前引用对象，并且调用其方法时，this可省略。
    //返回值是语句块的最后一行，若最后一行语句无返回值，则整个run语句块也无返回值
//    change = list.run {
//        this.add("shanghai")
//        add("tianjin")
//        this.size
//    }

    //--------with用法
//    change = with(list){
//        this.add("name")
//        add("age")
//        size
//    }

    //------------also用法
    change = list.also {
        it.add("also")
        it.size
    }
    println("-----list---$list")
    println("-----change--$change")


}