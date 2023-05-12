package g0901_1000.s0992_subarrays_with_k_different_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarraysWithKDistinct() {
        assertThat(Solution().subarraysWithKDistinct(intArrayOf(1, 2, 1, 2, 3), 2), equalTo(7))
    }

    @Test
    fun subarraysWithKDistinct2() {
        assertThat(Solution().subarraysWithKDistinct(intArrayOf(1, 2, 1, 3, 4), 3), equalTo(3))
    }
}
