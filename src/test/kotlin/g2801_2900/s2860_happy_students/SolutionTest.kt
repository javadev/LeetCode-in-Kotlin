package g2801_2900.s2860_happy_students

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countWays() {
        MatcherAssert.assertThat(Solution().countWays(mutableListOf(1, 1)), CoreMatchers.equalTo(2))
    }

    @Test
    fun countWays2() {
        MatcherAssert.assertThat(Solution().countWays(mutableListOf(6, 0, 3, 3, 6, 7, 2, 7)), CoreMatchers.equalTo(3))
    }
}
