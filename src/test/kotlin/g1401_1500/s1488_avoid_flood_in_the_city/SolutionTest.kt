package g1401_1500.s1488_avoid_flood_in_the_city

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun avoidFlood() {
        assertThat(
            Solution().avoidFlood(intArrayOf(1, 2, 3, 4)),
            equalTo(intArrayOf(-1, -1, -1, -1)),
        )
    }

    @Test
    fun avoidFlood2() {
        assertThat(
            Solution().avoidFlood(intArrayOf(1, 2, 0, 0, 2, 1)),
            equalTo(intArrayOf(-1, -1, 2, 1, -1, -1)),
        )
    }

    @Test
    fun avoidFlood3() {
        assertThat(Solution().avoidFlood(intArrayOf(1, 2, 0, 1, 2)), equalTo(intArrayOf()))
    }
}
