package g3601_3700.s3608_minimum_time_for_k_connected_components

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTime() {
        assertThat<Int>(
            Solution().minTime(2, arrayOf<IntArray>(intArrayOf(0, 1, 3)), 2),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minTime2() {
        assertThat<Int>(
            Solution().minTime(
                3,
                arrayOf<IntArray>(intArrayOf(0, 1, 2), intArrayOf(1, 2, 4)),
                3,
            ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun minTime3() {
        assertThat<Int>(
            Solution().minTime(3, arrayOf<IntArray>(intArrayOf(0, 2, 5)), 2),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minTime4() {
        assertThat(
            Solution().minTime(3, arrayOf<IntArray>(intArrayOf(2, 1, 1469), intArrayOf(1, 0, 5701)), 2),
            equalTo(1469),
        )
    }
}
