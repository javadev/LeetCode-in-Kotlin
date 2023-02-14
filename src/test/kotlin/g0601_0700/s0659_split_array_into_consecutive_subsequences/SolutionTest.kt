package g0601_0700.s0659_split_array_into_consecutive_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPossible() {
        assertThat(Solution().isPossible(intArrayOf(1, 2, 3, 3, 4, 5)), equalTo(true))
    }

    @Test
    fun isPossible2() {
        assertThat(Solution().isPossible(intArrayOf(1, 2, 3, 3, 4, 4, 5, 5)), equalTo(true))
    }
}
