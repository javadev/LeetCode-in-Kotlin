package g1301_1400.s1354_construct_target_array_with_multiple_sums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPossible() {
        assertThat(Solution().isPossible(intArrayOf(9, 3, 5)), equalTo(true))
    }

    @Test
    fun isPossible2() {
        assertThat(Solution().isPossible(intArrayOf(1, 1, 1, 2)), equalTo(false))
    }

    @Test
    fun isPossible3() {
        assertThat(Solution().isPossible(intArrayOf(8, 5)), equalTo(true))
    }
}
