package g2801_2900.s2860_happy_students

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countWays() {
        assertThat(Solution().countWays(mutableListOf(1, 1)), equalTo(2))
    }

    @Test
    fun countWays2() {
        assertThat(Solution().countWays(mutableListOf(6, 0, 3, 3, 6, 7, 2, 7)), equalTo(3))
    }
}
