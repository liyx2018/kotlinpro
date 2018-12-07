package basicsyntax

import java.util.concurrent.locks.Lock

class Demo13{


    inline fun <T> check(lock: Lock, noinline body: () -> T): T {
        lock.lock()
        try {
            return body()
        } finally {
            lock.unlock()
        }
    }

}

lateinit var name: String

fun main(args: Array<String>) {

    require(name.isNotEmpty()){"invalid name"}

}


