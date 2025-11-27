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

    @Test
    fun search4() {
        assertThat(Solution().search(intArrayOf(1, 2, 3, 4, 5, 6), 4), equalTo(3))
    }

    @Test
    fun search5() {
        assertThat(Solution().search(intArrayOf(1, 2, 3, 4, 5, 6), 10), equalTo(-1))
    }

    @Test
    fun search6() {
        assertThat(Solution().search(intArrayOf(6, 7, 0, 1, 2, 3, 4), 7), equalTo(1))
    }

    @Test
    fun search7() {
        assertThat(Solution().search(intArrayOf(6, 7, 0, 1, 2, 3, 4), 3), equalTo(5))
    }

    @Test
    fun search8() {
        assertThat(Solution().search(intArrayOf(5, 1), 1), equalTo(1))
    }

    @Test
    fun search9() {
        assertThat(Solution().search(intArrayOf(5, 1), 2), equalTo(-1))
    }

    @Test
    fun search10() {
        assertThat(Solution().search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 4), equalTo(0))
    }

    @Test
    fun search11() {
        assertThat(Solution().search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 2), equalTo(6))
    }

    @Test
    fun search12() {
        assertThat(Solution().search(intArrayOf(2, 3, 4, 5, 6, 0, 1), 0), equalTo(5))
    }

    @Test
    fun search13() {
        assertThat(Solution().search(intArrayOf(0, 1, 2, 3, 4, 5), 3), equalTo(3))
    }

    @Test
    fun search14() {
        assertThat(Solution().search(intArrayOf(5, 6, 7, 0, 1, 2, 3), 2), equalTo(5))
    }

    @Test
    fun search15() {
        assertThat(Solution().search(intArrayOf(5, 6, 7, 0, 1, 2, 3), 6), equalTo(1))
    }
}
