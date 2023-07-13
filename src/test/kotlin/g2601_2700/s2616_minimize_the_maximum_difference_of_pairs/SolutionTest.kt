package g2601_2700.s2616_minimize_the_maximum_difference_of_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeMax() {
        assertThat(Solution().minimizeMax(intArrayOf(10, 1, 2, 7, 1, 3), 2), equalTo(1))
    }

    @Test
    fun minimizeMax2() {
        assertThat(Solution().minimizeMax(intArrayOf(4, 2, 1, 2), 1), equalTo(0))
    }
}
