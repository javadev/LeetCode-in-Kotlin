package g1701_1800.s1760_minimum_limit_of_balls_in_a_bag

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSize() {
        assertThat(Solution().minimumSize(intArrayOf(9), 2), equalTo(3))
    }

    @Test
    fun minimumSize2() {
        assertThat(Solution().minimumSize(intArrayOf(2, 4, 8, 2), 4), equalTo(2))
    }

    @Test
    fun minimumSize3() {
        assertThat(Solution().minimumSize(intArrayOf(7, 17), 2), equalTo(7))
    }
}
