package exercise.generic

class GenericClass<T> {

    fun getName(name:T):T{
        return name
    }

    fun <M> getM(params:M){

    }

}

interface Gene<T>{
    fun getParam(params :T)
}

class GeneChild : Gene<String>{
    override fun getParam(params: String) {

    }
}

fun main(args: Array<String>) {
}