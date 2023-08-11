package g2501_2600.s2585_number_of_ways_to_earn_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToReachTarget() {
        assertThat(
            Solution().waysToReachTarget(
                5,
                arrayOf(
                    intArrayOf(50, 1), intArrayOf(50, 2),
                    intArrayOf(50, 5)
                )
            ),
            equalTo(4)
        )
    }

    @Test
    fun waysToReachTarget2() {
        assertThat(
            Solution().waysToReachTarget(
                6,
                arrayOf(
                    intArrayOf(6, 1), intArrayOf(3, 2),
                    intArrayOf(2, 3)
                )
            ),
            equalTo(7)
        )
    }

    @Test
    fun waysToReachTarget3() {
        assertThat(
            Solution().waysToReachTarget(
                18,
                arrayOf(
                    intArrayOf(6, 1), intArrayOf(3, 2),
                    intArrayOf(2, 3)
                )
            ),
            equalTo(1)
        )
    }
}
