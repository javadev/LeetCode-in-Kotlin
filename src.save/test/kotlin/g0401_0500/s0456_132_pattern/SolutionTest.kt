package g0401_0500.s0456_132_pattern

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun find132pattern() {
        assertThat(Solution().find132pattern(intArrayOf(1, 2, 3, 4)), equalTo(false))
    }

    @Test
    fun find132pattern2() {
        assertThat(Solution().find132pattern(intArrayOf(3, 1, 4, 2)), equalTo(true))
    }

    @Test
    fun find132pattern3() {
        assertThat(Solution().find132pattern(intArrayOf(-1, 3, 2, 0)), equalTo(true))
    }
}
