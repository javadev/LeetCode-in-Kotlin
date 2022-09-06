package g0201_0300.s0300_longest_increasing_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthOfLIS() {
        assertThat(
            Solution().lengthOfLIS(intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)),
            equalTo(4)
        )
    }

    @Test
    fun lengthOfLIS2() {
        assertThat(Solution().lengthOfLIS(intArrayOf(0, 1, 0, 3, 2, 3)), equalTo(4))
    }

    @Test
    fun lengthOfLIS3() {
        assertThat(Solution().lengthOfLIS(intArrayOf(7, 7, 7, 7, 7, 7, 7)), equalTo(1))
    }
}
