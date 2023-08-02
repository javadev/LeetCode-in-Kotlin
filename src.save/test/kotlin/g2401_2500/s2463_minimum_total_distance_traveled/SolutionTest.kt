package g2401_2500.s2463_minimum_total_distance_traveled

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTotalDistance() {
        assertThat(
            Solution()
                .minimumTotalDistance(mutableListOf(0, 4, 6), arrayOf(intArrayOf(2, 2), intArrayOf(6, 2))),
            equalTo(4L)
        )
    }

    @Test
    fun minimumTotalDistance2() {
        assertThat(
            Solution()
                .minimumTotalDistance(listOf(1, -1), arrayOf(intArrayOf(-2, 1), intArrayOf(2, 1))),
            equalTo(2L)
        )
    }
}
