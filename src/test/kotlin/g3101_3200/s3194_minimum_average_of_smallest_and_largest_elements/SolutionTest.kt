package g3101_3200.s3194_minimum_average_of_smallest_and_largest_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumAverage() {
        assertThat(
            Solution().minimumAverage(intArrayOf(7, 8, 3, 4, 15, 13, 4, 1)), equalTo(5.5)
        )
    }

    @Test
    fun minimumAverage2() {
        assertThat(Solution().minimumAverage(intArrayOf(1, 9, 8, 3, 10, 5)), equalTo(5.5))
    }

    @Test
    fun minimumAverage3() {
        assertThat(Solution().minimumAverage(intArrayOf(1, 2, 3, 7, 8, 9)), equalTo(5.0))
    }
}
