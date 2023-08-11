package g2401_2500.s2401_longest_nice_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestNiceSubarray() {
        assertThat(Solution().longestNiceSubarray(intArrayOf(1, 3, 8, 48, 10)), equalTo(3))
    }

    @Test
    fun longestNiceSubarray2() {
        assertThat(Solution().longestNiceSubarray(intArrayOf(3, 1, 5, 11, 13)), equalTo(1))
    }
}
