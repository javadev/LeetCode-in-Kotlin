package g2001_2100.s2044_count_number_of_maximum_bitwise_or_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMaxOrSubsets() {
        assertThat(Solution().countMaxOrSubsets(intArrayOf(3, 1)), equalTo(2))
    }

    @Test
    fun countMaxOrSubsets2() {
        assertThat(Solution().countMaxOrSubsets(intArrayOf(2, 2, 2)), equalTo(7))
    }

    @Test
    fun countMaxOrSubsets3() {
        assertThat(Solution().countMaxOrSubsets(intArrayOf(3, 2, 1, 5)), equalTo(6))
    }
}
