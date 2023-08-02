package g1101_1200.s1195_fizz_buzz_multithreaded

// #Medium #Concurrency #2023_05_31_Time_6_ms_(87.26%)_Space_41.9_MB_(96.15%)

import java.util.concurrent.atomic.AtomicInteger
import java.util.function.IntConsumer

class FizzBuzz(private val n: Int) {
    private val count = AtomicInteger(1)

    // printFizz.run() outputs "fizz".
    @Throws(InterruptedException::class)
    fun fizz(printFizz: Runnable) {
        var i: Int
        while (count.get().also { i = it } <= n) {
            if (i % 3 == 0 && i % 5 != 0) {
                printFizz.run()
                count.compareAndSet(i, i + 1)
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    @Throws(InterruptedException::class)
    fun buzz(printBuzz: Runnable) {
        var i: Int
        while (count.get().also { i = it } <= n) {
            count.get()
            if (i % 5 == 0 && i % 3 != 0) {
                printBuzz.run()
                count.compareAndSet(i, i + 1)
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    @Throws(InterruptedException::class)
    fun fizzbuzz(printFizzBuzz: Runnable) {
        var i: Int
        while (count.get().also { i = it } <= n) {
            if (i % 15 == 0) {
                printFizzBuzz.run()
                count.compareAndSet(i, i + 1)
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    @Throws(InterruptedException::class)
    fun number(printNumber: IntConsumer) {
        var i: Int
        while (count.get().also { i = it } <= n) {
            if (i % 5 != 0 && i % 3 != 0) {
                printNumber.accept(i)
                count.compareAndSet(i, i + 1)
            }
        }
    }
}
