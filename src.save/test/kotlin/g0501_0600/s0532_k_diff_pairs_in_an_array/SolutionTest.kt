package g0501_0600.s0532_k_diff_pairs_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPairs() {
        assertThat(Solution().findPairs(intArrayOf(3, 1, 4, 1, 5), 2), equalTo(2))
    }

    @Test
    fun findPairs2() {
        assertThat(Solution().findPairs(intArrayOf(1, 2, 3, 4, 5), 1), equalTo(4))
    }

    @Test
    fun findPairs3() {
        assertThat(Solution().findPairs(intArrayOf(1, 3, 1, 5, 4), 0), equalTo(1))
    }
}
