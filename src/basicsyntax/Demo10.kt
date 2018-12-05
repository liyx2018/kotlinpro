package basicsyntax

/**
 * 返回与跳转
 */
fun main(args: Array<String>) {
    doctorq@ for (i in 1..100) {
        doctorq2@ for (j in 1..5) {
            if (i == 2) break@doctorq
            println(">>>>" + j)
            println("======" + i)
        }
    }
    fool()
}

fun fool() {
    val ints = listOf(0, 1, 2, 3, 4, 5)
    ints.forEach lits@{
        if (it == 2) return@lits
        println("***************************" + it)
    }

    ints.forEach {
        if (it == 2) return@forEach
        println("############################" + it)
    }

    for (item in ints) {
        if (item == 3) break
        println(">>>>>>>>" + item)
    }

}
