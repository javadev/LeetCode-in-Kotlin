package g1901_2000.s1911_maximum_alternating_subsequence_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAlternatingSum() {
        assertThat(Solution().maxAlternatingSum(intArrayOf(4, 2, 5, 3)), equalTo(7L))
    }

    @Test
    fun maxAlternatingSum2() {
        assertThat(Solution().maxAlternatingSum(intArrayOf(5, 6, 7, 8)), equalTo(8L))
    }

    @Test
    fun maxAlternatingSum3() {
        assertThat(Solution().maxAlternatingSum(intArrayOf(6, 2, 1, 2, 4, 5)), equalTo(10L))
    }
}
