package g1101_1200.s1191_k_concatenation_maximum_sum

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kConcatenationMaxSum() {
        MatcherAssert.assertThat(Solution().kConcatenationMaxSum(intArrayOf(1, 2), 3), CoreMatchers.equalTo(9))
    }

    @Test
    fun kConcatenationMaxSum2() {
        MatcherAssert.assertThat(Solution().kConcatenationMaxSum(intArrayOf(1, -2, 1), 5), CoreMatchers.equalTo(2))
    }

    @Test
    fun kConcatenationMaxSum3() {
        MatcherAssert.assertThat(Solution().kConcatenationMaxSum(intArrayOf(-1, -2), 7), CoreMatchers.equalTo(0))
    }

    @Test
    fun kConcatenationMaxSum4() {
        MatcherAssert.assertThat(Solution().kConcatenationMaxSum(intArrayOf(-1, -2), 1), CoreMatchers.equalTo(0))
    }
}
