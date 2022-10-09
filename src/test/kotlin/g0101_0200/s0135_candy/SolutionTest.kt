package g0101_0200.s0135_candy

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun candy() {
        assertThat(Solution().candy(intArrayOf(1, 0, 2)), equalTo(5))
    }

    @Test
    fun candy2() {
        assertThat(Solution().candy(intArrayOf(1, 2, 2)), equalTo(4))
    }
}
