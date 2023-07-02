package g2301_2400.s2357_make_array_zero_by_subtracting_equal_amounts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(Solution().minimumOperations(intArrayOf(1, 5, 0, 3, 5)), equalTo(3))
    }

    @Test
    fun minimumOperations2() {
        assertThat(Solution().minimumOperations(intArrayOf(0)), equalTo(0))
    }
}
