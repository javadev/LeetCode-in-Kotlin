package g2001_2100.s2044_count_number_of_maximum_bitwise_or_subsets

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMaxOrSubsets() {
        MatcherAssert.assertThat(Solution().countMaxOrSubsets(intArrayOf(3, 1)), CoreMatchers.equalTo(2))
    }

    @Test
    fun countMaxOrSubsets2() {
        MatcherAssert.assertThat(Solution().countMaxOrSubsets(intArrayOf(2, 2, 2)), CoreMatchers.equalTo(7))
    }

    @Test
    fun countMaxOrSubsets3() {
        MatcherAssert.assertThat(Solution().countMaxOrSubsets(intArrayOf(3, 2, 1, 5)), CoreMatchers.equalTo(6))
    }
}
