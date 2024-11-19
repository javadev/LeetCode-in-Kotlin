package g0901_1000.s0994_rotting_oranges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun orangesRotting() {
        assertThat(
            Solution().orangesRotting(arrayOf(intArrayOf(2, 1, 1), intArrayOf(1, 1, 0), intArrayOf(0, 1, 1))),
            equalTo(4),
        )
    }

    @Test
    fun orangesRotting2() {
        assertThat(Solution().orangesRotting(arrayOf(intArrayOf(0, 2))), equalTo(0))
    }
}
