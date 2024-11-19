package g2401_2500.s2407_longest_increasing_subsequence_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthOfLIS() {
        assertThat(
            Solution().lengthOfLIS(intArrayOf(4, 2, 1, 4, 3, 4, 5, 8, 15), 3),
            equalTo(5),
        )
    }

    @Test
    fun lengthOfLIS2() {
        assertThat(
            Solution().lengthOfLIS(intArrayOf(7, 4, 5, 1, 8, 12, 4, 7), 5),
            equalTo(4),
        )
    }

    @Test
    fun lengthOfLIS3() {
        assertThat(Solution().lengthOfLIS(intArrayOf(1, 5), 1), equalTo(1))
    }
}
