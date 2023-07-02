package g1301_1400.s1304_find_n_unique_integers_sum_up_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumZero() {
        assertThat(Solution().sumZero(5), equalTo(intArrayOf(-2, -1, 0, 1, 2)))
    }

    @Test
    fun sumZero2() {
        assertThat(Solution().sumZero(3), equalTo(intArrayOf(-1, 0, 1)))
    }

    @Test
    fun sumZero3() {
        assertThat(Solution().sumZero(1), equalTo(intArrayOf(0)))
    }
}
