package g2501_2600.s2574_left_and_right_sum_differences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun leftRightDifference() {
        assertThat(
            Solution().leftRightDifference(intArrayOf(10, 4, 8, 3)),
            equalTo(intArrayOf(15, 1, 11, 22)),
        )
    }

    @Test
    fun leftRightDifference2() {
        assertThat(
            Solution().leftRightDifference(intArrayOf(1)),
            equalTo(intArrayOf(0)),
        )
    }
}
