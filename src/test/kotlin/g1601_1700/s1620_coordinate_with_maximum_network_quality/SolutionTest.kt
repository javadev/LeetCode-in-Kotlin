package g1601_1700.s1620_coordinate_with_maximum_network_quality

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bestCoordinate() {
        assertThat(
            Solution().bestCoordinate(arrayOf(intArrayOf(1, 2, 5), intArrayOf(2, 1, 7), intArrayOf(3, 1, 9)), 2),
            equalTo(intArrayOf(2, 1))
        )
    }

    @Test
    fun bestCoordinate2() {
        assertThat(
            Solution().bestCoordinate(arrayOf(intArrayOf(23, 11, 21)), 9),
            equalTo(intArrayOf(23, 11))
        )
    }

    @Test
    fun bestCoordinate3() {
        assertThat(
            Solution().bestCoordinate(arrayOf(intArrayOf(1, 2, 13), intArrayOf(2, 1, 7), intArrayOf(0, 1, 9)), 2),
            equalTo(intArrayOf(1, 2))
        )
    }
}
