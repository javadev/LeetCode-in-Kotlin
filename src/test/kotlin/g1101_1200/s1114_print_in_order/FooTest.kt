package g1101_1200.s1114_print_in_order

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
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
        TimeUnit.MILLISECONDS.sleep(800)
        MatcherAssert.assertThat(fooData[0], CoreMatchers.equalTo(3))
    }
}
