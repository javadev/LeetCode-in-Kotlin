package g0001_0100.s0035_search_insert_position

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun searchInsert() {
        assertThat(Solution().searchInsert(intArrayOf(1, 3, 5, 6), 5), equalTo(2))
    }

    @Test
    fun searchInsert2() {
        assertThat(Solution().searchInsert(intArrayOf(1, 3, 5, 6), 2), equalTo(1))
    }

    @Test
    fun searchInsert3() {
        assertThat(Solution().searchInsert(intArrayOf(1, 3, 5, 6), 7), equalTo(4))
    }
}
