package g2901_3000.s2945_find_maximum_non_decreasing_array_length

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaximumLength() {
        assertThat(Solution().findMaximumLength(intArrayOf(5, 2, 2)), equalTo(1))
    }

    @Test
    fun findMaximumLength2() {
        assertThat(Solution().findMaximumLength(intArrayOf(1, 2, 3, 4)), equalTo(4))
    }

    @Test
    fun findMaximumLength3() {
        assertThat(Solution().findMaximumLength(intArrayOf(4, 3, 2, 6)), equalTo(3))
    }
}
