package g3801_3900.s3880_minimum_absolute_difference_between_two_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAbsoluteDifference() {
        assertThat<Int>(
            Solution().minAbsoluteDifference(intArrayOf(1, 0, 0, 2, 0, 1)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minAbsoluteDifference2() {
        assertThat<Int>(
            Solution().minAbsoluteDifference(intArrayOf(1, 0, 1, 0)),
            equalTo<Int>(-1),
        )
    }
}
