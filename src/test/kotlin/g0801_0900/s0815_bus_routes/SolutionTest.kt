package g0801_0900.s0815_bus_routes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numBusesToDestination() {
        assertThat(
            Solution().numBusesToDestination(arrayOf(intArrayOf(1, 2, 7), intArrayOf(3, 6, 7)), 1, 6),
            equalTo(2),
        )
    }

    @Test
    fun numBusesToDestination2() {
        assertThat(
            Solution()
                .numBusesToDestination(
                    arrayOf(
                        intArrayOf(7, 12),
                        intArrayOf(4, 5, 15),
                        intArrayOf(6),
                        intArrayOf(15, 19),
                        intArrayOf(9, 12, 13),
                    ),
                    15,
                    12,
                ),
            equalTo(-1),
        )
    }
}
