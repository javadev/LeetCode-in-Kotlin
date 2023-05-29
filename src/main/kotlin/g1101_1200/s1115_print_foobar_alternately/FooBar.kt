package g1101_1200.s1115_print_foobar_alternately

import java.util.concurrent.Semaphore

// #Medium #Concurrency

class FooBar(private val n: Int) {
    private val fooSemaphore: Semaphore
    private val barSemaphore: Semaphore

    init {
        fooSemaphore = Semaphore(1)
        barSemaphore = Semaphore(1)
        try {
            barSemaphore.acquire()
        } catch (ignored: InterruptedException) {
            // ignored
        }
    }

    @Throws(InterruptedException::class)
    fun foo(printFoo: Runnable) {
        for (i in 0 until n) {
            fooSemaphore.acquire()
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run()
            barSemaphore.release()
        }
    }

    @Throws(InterruptedException::class)
    fun bar(printBar: Runnable) {
        for (i in 0 until n) {
            barSemaphore.acquire()
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run()
            fooSemaphore.release()
        }
    }
}