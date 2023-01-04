package g0001_0100.s0081_search_in_rotated_sorted_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun search() {
        assertThat(Solution().search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0), equalTo(true))
    }

    @Test
    fun search2() {
        assertThat(Solution().search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3), equalTo(false))
    }
}
