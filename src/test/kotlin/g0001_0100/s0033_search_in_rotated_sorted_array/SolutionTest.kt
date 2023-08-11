package g0001_0100.s0033_search_in_rotated_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun search() {
        assertThat(Solution().search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0), equalTo(4))
    }

    @Test
    fun search2() {
        assertThat(Solution().search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3), equalTo(-1))
    }

    @Test
    fun search3() {
        assertThat(Solution().search(intArrayOf(1), 0), equalTo(-1))
    }
}
