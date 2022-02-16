package exercise.sealeadclass

sealed class Result
class Success : Result()
class Fail : Result()
class Retry :Result()

/**
 * 密封类 子类和sealead class定义在顶层位置  子类继承sealead class
 * 联合when表达式使用时 可以避免出现有方法漏掉
 */
fun main(args: Array<String>) {
    val s = Success()
    getResult(s)

}

fun getResult(result: Result) = when(result){
    is Success -> println("成功了啊")
    is Fail -> println("失败了呀")
    is Retry -> println("重试吧")
}
