package g2601_2700.s2606_find_the_substring_with_maximum_cost

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumCostSubstring() {
        assertThat(Solution().maximumCostSubstring("adaa", "d", intArrayOf(-1000)), equalTo(2))
    }

    @Test
    fun maximumCostSubstring2() {
        assertThat(Solution().maximumCostSubstring("abc", "abc", intArrayOf(-1, -1, -1)), equalTo(0))
    }
}
