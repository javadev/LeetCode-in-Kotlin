package g0601_0700.s0670_maximum_swap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSwap() {
        assertThat(Solution().maximumSwap(2736), equalTo(7236))
    }

    @Test
    fun maximumSwap2() {
        assertThat(Solution().maximumSwap(9973), equalTo(9973))
    }
}
