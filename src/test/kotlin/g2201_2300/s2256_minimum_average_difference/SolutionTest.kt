package g2201_2300.s2256_minimum_average_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumAverageDifference() {
        assertThat(
            Solution().minimumAverageDifference(intArrayOf(2, 5, 3, 9, 5, 3)), equalTo(3)
        )
    }

    @Test
    fun minimumAverageDifference2() {
        assertThat(Solution().minimumAverageDifference(intArrayOf(0)), equalTo(0))
    }

    @Test
    fun minimumAverageDifference3() {
        assertThat(Solution().minimumAverageDifference(intArrayOf(4, 2, 0)), equalTo(2))
    }
}
