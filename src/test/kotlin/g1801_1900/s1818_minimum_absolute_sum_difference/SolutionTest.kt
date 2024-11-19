package g1801_1900.s1818_minimum_absolute_sum_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAbsoluteSumDiff() {
        assertThat(
            Solution().minAbsoluteSumDiff(intArrayOf(1, 7, 5), intArrayOf(2, 3, 5)),
            equalTo(3),
        )
    }

    @Test
    fun minAbsoluteSumDiff2() {
        assertThat(
            Solution()
                .minAbsoluteSumDiff(intArrayOf(2, 4, 6, 8, 10), intArrayOf(2, 4, 6, 8, 10)),
            equalTo(0),
        )
    }

    @Test
    fun minAbsoluteSumDiff3() {
        assertThat(
            Solution()
                .minAbsoluteSumDiff(intArrayOf(1, 10, 4, 4, 2, 7), intArrayOf(9, 3, 5, 1, 7, 4)),
            equalTo(20),
        )
    }
}
