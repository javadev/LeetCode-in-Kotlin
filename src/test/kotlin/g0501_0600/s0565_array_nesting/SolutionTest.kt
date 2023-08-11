package g0501_0600.s0565_array_nesting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arrayNesting() {
        assertThat(Solution().arrayNesting(intArrayOf(5, 4, 0, 3, 1, 6, 2)), equalTo(4))
    }

    @Test
    fun arrayNesting2() {
        assertThat(Solution().arrayNesting(intArrayOf(0, 1, 2)), equalTo(1))
    }
}
