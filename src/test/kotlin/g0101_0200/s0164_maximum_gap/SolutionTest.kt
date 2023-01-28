package g0101_0200.s0164_maximum_gap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumGap() {
        assertThat(Solution().maximumGap(intArrayOf(3, 6, 9, 1)), equalTo(3))
    }

    @Test
    fun maximumGap2() {
        assertThat(Solution().maximumGap(intArrayOf(10)), equalTo(0))
    }
}
