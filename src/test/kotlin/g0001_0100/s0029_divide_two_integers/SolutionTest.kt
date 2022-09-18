package g0001_0100.s0029_divide_two_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divide() {
        assertThat(Solution().divide(10, 3), equalTo(3))
    }

    @Test
    fun divide2() {
        assertThat(Solution().divide(7, -3), equalTo(-2))
    }
}
