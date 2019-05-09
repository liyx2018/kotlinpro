package delegation

class Driver(b: Base) : Base by b


fun main(args: Array<String>) {
    val base =  BaseImpl()
    val  driver =Driver(base)
    driver.sayhi()


}