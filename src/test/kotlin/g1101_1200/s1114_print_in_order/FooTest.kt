package g1101_1200.s1114_print_in_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.concurrent.TimeUnit

internal class FooTest {
    @Test
    @Throws(InterruptedException::class)
    fun foo() {
        val fooData = intArrayOf(0)
        val foo = Foo()
        Thread { foo.first { fooData[0]++ } }.start()
        Thread { foo.second { fooData[0]++ } }.start()
        Thread { foo.third { fooData[0]++ } }.start()
        TimeUnit.MILLISECONDS.sleep(2000)
        assertThat(fooData[0], equalTo(3))
    }
}
