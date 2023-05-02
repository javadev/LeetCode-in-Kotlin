package g0901_1000.s0952_largest_component_size_by_common_factor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestComponentSize() {
        assertThat(Solution().largestComponentSize(intArrayOf(4, 6, 15, 35)), equalTo(4))
    }

    @Test
    fun largestComponentSize2() {
        assertThat(Solution().largestComponentSize(intArrayOf(20, 50, 9, 63)), equalTo(2))
    }

    @Test
    fun largestComponentSize3() {
        assertThat(
            Solution().largestComponentSize(intArrayOf(2, 3, 6, 7, 4, 12, 21, 39)),
            equalTo(8)
        )
    }
}
