package g2901_3000.s2917_find_the_k_or_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKOr() {
        assertThat(Solution().findKOr(intArrayOf(7, 12, 9, 8, 9, 15), 4), equalTo(9))
    }

    @Test
    fun findKOr2() {
        assertThat(Solution().findKOr(intArrayOf(2, 12, 1, 11, 4, 5), 6), equalTo(0))
    }

    @Test
    fun findKOr3() {
        assertThat(Solution().findKOr(intArrayOf(10, 8, 5, 9, 11, 6, 8), 1), equalTo(15))
    }
}
