package g2901_3000.s2926_maximum_balanced_subsequence_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxBalancedSubsequenceSum() {
        assertThat(
            Solution().maxBalancedSubsequenceSum(intArrayOf(3, 3, 5, 6)),
            equalTo(14L)
        )
    }

    @Test
    fun maxBalancedSubsequenceSum2() {
        assertThat(
            Solution().maxBalancedSubsequenceSum(intArrayOf(5, -1, -3, 8)), equalTo(13L)
        )
    }

    @Test
    fun maxBalancedSubsequenceSum3() {
        assertThat(
            Solution().maxBalancedSubsequenceSum(intArrayOf(5, -1, -3, 8)), equalTo(13L)
        )
    }
}
