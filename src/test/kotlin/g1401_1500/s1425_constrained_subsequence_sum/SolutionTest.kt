package g1401_1500.s1425_constrained_subsequence_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constrainedSubsetSum() {
        assertThat(
            Solution().constrainedSubsetSum(intArrayOf(10, 2, -10, 5, 20), 2),
            equalTo(37),
        )
    }

    @Test
    fun constrainedSubsetSum2() {
        assertThat(Solution().constrainedSubsetSum(intArrayOf(-1, -2, -3), 1), equalTo(-1))
    }

    @Test
    fun constrainedSubsetSum3() {
        assertThat(
            Solution().constrainedSubsetSum(intArrayOf(10, -2, -10, -5, 20), 2),
            equalTo(23),
        )
    }
}
