package exercise.operator

class Money(val value: Int) {

    //money + money
    operator fun plus(money: Money):Money{
        val sum = value + money.value
        return Money(sum)
    }

    //money + int
    operator fun plus(money :Int):Money{
        val sum = value+money
        return Money(sum)
    }


}