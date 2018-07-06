package classesaobjects

//Kotlin伴随对象的使用
class CompanionDemo {

  companion object {

      fun action(){
          println("-----action---")
      }

      var name: String ="liyaxi"

  }



}

fun main(args: Array<String>) {

    CompanionDemo.action()
    println("--------------"+CompanionDemo.name)


}