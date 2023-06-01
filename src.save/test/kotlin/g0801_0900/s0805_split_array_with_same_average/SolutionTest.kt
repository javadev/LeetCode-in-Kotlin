package g0801_0900.s0805_split_array_with_same_average

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitArraySameAverage() {
        assertThat(
            Solution().splitArraySameAverage(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)),
            equalTo(true)
        )
    }

    @Test
    fun splitArraySameAverage2() {
        assertThat(Solution().splitArraySameAverage(intArrayOf(3, 1)), equalTo(false))
    }
}
