package g1101_1200.s1116_print_zero_even_odd

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit
import java.util.function.IntConsumer

internal class ZeroEvenOddTest {
    @Test
    @Throws(InterruptedException::class)
    fun zeroEvenOdd() {
        val zeroEvenOddData = intArrayOf(0)
        val consumer = IntConsumer { data: Int -> zeroEvenOddData[0]++ }
        val n = 5
        val zeroEvenOdd = ZeroEvenOdd(n)
        val firstThread = Thread {
            try {
                zeroEvenOdd.zero(consumer)
            } catch (ignored: Exception) {
            }
        }
        val secondThread = Thread {
            try {
                zeroEvenOdd.odd(consumer)
            } catch (ignored: Exception) {
            }
        }
        val thirdThread = Thread {
            try {
                zeroEvenOdd.even(consumer)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        firstThread.start()
        secondThread.start()
        thirdThread.start()
        firstThread.join()
        secondThread.join()
        thirdThread.join()
        TimeUnit.MILLISECONDS.sleep(100)
        MatcherAssert.assertThat(zeroEvenOddData[0], CoreMatchers.equalTo(10))
    }
}
