package g0401_0500.s0436_find_right_interval

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRightInterval() {
        assertThat(Solution().findRightInterval(arrayOf(intArrayOf(1, 2))), equalTo(intArrayOf(-1)))
    }

    @Test
    fun findRightInterval2() {
        assertThat(
            Solution().findRightInterval(arrayOf(intArrayOf(3, 4), intArrayOf(2, 3), intArrayOf(1, 2))),
            equalTo(intArrayOf(-1, 0, 1)),
        )
    }
}
