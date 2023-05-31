package g1101_1200.s1116_print_zero_even_odd

// #Medium #Concurrency #2023_05_31_Time_7_ms_(39.21%)_Space_42.3_MB_(13.69%)

import java.util.concurrent.Semaphore
import java.util.function.IntConsumer

class ZeroEvenOdd(private val n: Int) {
    private val zeroSemaphore = Semaphore(1)
    private val oddSemaphore = Semaphore(1)
    private val evenSemaphore = Semaphore(1)

    init {
        try {
            oddSemaphore.acquire()
            evenSemaphore.acquire()
        } catch (ignored: InterruptedException) {
            // ignored
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    @Throws(InterruptedException::class)
    fun zero(printNumber: IntConsumer) {
        for (i in 1..n) {
            zeroSemaphore.acquire()
            printNumber.accept(0)
            if (i % 2 == 0) {
                oddSemaphore.release()
            } else {
                evenSemaphore.release()
            }
        }
        oddSemaphore.release()
        evenSemaphore.release()
    }

    @Throws(InterruptedException::class)
    fun odd(printNumber: IntConsumer) {
        var i = 1
        while (i <= n) {
            evenSemaphore.acquire()
            if (i > n) {
                zeroSemaphore.release()
                evenSemaphore.release()
                break
            }
            printNumber.accept(i)
            zeroSemaphore.release()
            i += 2
        }
    }

    @Throws(InterruptedException::class)
    fun even(printNumber: IntConsumer) {
        var i = 2
        while (i <= n) {
            oddSemaphore.acquire()
            if (i > n) {
                zeroSemaphore.release()
                oddSemaphore.release()
                break
            }
            printNumber.accept(i)
            zeroSemaphore.release()
            i += 2
        }
    }
}
