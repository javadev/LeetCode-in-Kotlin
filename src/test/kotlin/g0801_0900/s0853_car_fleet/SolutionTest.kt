package g0801_0900.s0853_car_fleet

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun carFleet() {
        assertThat(
            Solution().carFleet(12, intArrayOf(10, 8, 0, 5, 3), intArrayOf(2, 4, 1, 1, 3)),
            equalTo(3)
        )
    }

    @Test
    fun carFleet2() {
        assertThat(Solution().carFleet(10, intArrayOf(3), intArrayOf(3)), equalTo(1))
    }

    @Test
    fun carFleet3() {
        assertThat(
            Solution().carFleet(100, intArrayOf(0, 2, 4), intArrayOf(4, 2, 1)), equalTo(1)
        )
    }
}
