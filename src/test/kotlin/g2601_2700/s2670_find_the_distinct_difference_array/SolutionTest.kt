package g2601_2700.s2670_find_the_distinct_difference_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctDifferenceArray() {
        assertThat(
            Solution().distinctDifferenceArray(intArrayOf(1, 2, 3, 4, 5)),
            equalTo(intArrayOf(-3, -1, 1, 3, 5)),
        )
    }

    @Test
    fun distinctDifferenceArray2() {
        assertThat(
            Solution().distinctDifferenceArray(intArrayOf(3, 2, 3, 4, 2)),
            equalTo(intArrayOf(-2, -1, 0, 2, 3)),
        )
    }
}
