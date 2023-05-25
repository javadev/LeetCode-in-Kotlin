package g1101_1200.s1191_k_concatenation_maximum_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kConcatenationMaxSum() {
        assertThat(Solution().kConcatenationMaxSum(intArrayOf(1, 2), 3), equalTo(9))
    }

    @Test
    fun kConcatenationMaxSum2() {
        assertThat(Solution().kConcatenationMaxSum(intArrayOf(1, -2, 1), 5), equalTo(2))
    }

    @Test
    fun kConcatenationMaxSum3() {
        assertThat(Solution().kConcatenationMaxSum(intArrayOf(-1, -2), 7), equalTo(0))
    }

    @Test
    fun kConcatenationMaxSum4() {
        assertThat(Solution().kConcatenationMaxSum(intArrayOf(-1, -2), 1), equalTo(0))
    }
}
