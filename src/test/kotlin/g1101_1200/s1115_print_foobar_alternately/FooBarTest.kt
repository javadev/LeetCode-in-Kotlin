package g1101_1200.s1115_print_foobar_alternately

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

internal class FooBarTest {
    @Test
    @Throws(InterruptedException::class)
    fun fooBar() {
        val fooBarData = intArrayOf(0)
        val n = 1
        val fooPrinter = Runnable { fooBarData[0]++ }
        val barPrinter = Runnable { fooBarData[0]++ }
        val foobar = FooBar(n)
        val fooThread = Thread {
            try {
                foobar.foo(fooPrinter)
            } catch (ignored: InterruptedException) {
            }
        }
        val barThread = Thread {
            try {
                foobar.bar(barPrinter)
            } catch (ignored: InterruptedException) {
            }
        }
        fooThread.start()
        barThread.start()
        fooThread.join()
        barThread.join()
        TimeUnit.MILLISECONDS.sleep(100)
        MatcherAssert.assertThat(fooBarData[0], CoreMatchers.equalTo(2))
    }
}