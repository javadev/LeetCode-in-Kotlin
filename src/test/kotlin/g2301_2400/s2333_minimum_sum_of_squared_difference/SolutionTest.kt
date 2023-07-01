package g2301_2400.s2333_minimum_sum_of_squared_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSumSquareDiff() {
        assertThat(
            Solution()
                .minSumSquareDiff(intArrayOf(1, 2, 3, 4), intArrayOf(2, 10, 20, 19), 0, 0),
            equalTo(579L)
        )
    }

    @Test
    fun minSumSquareDiff2() {
        assertThat(
            Solution()
                .minSumSquareDiff(intArrayOf(1, 4, 10, 12), intArrayOf(5, 8, 6, 9), 1, 1),
            equalTo(43L)
        )
    }

    @Test
    fun minSumSquareDiff3() {
        assertThat(
            Solution()
                .minSumSquareDiff(
                    intArrayOf(7, 11, 4, 19, 11, 5, 6, 1, 8), intArrayOf(4, 7, 6, 16, 12, 9, 10, 2, 10),
                    3,
                    6
                ),
            equalTo(27L)
        )
    }
}
