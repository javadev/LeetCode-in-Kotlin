package g0001_0100.s0034_find_first_and_last_position_of_element_in_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun searchRange() {
        val expected = intArrayOf(3, 4)
        val actual = Solution().searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun searchRange2() {
        val expected = intArrayOf(-1, -1)
        val actual = Solution().searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6)
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun searchRange3() {
        val expected = intArrayOf(-1, -1)
        val actual = Solution().searchRange(intArrayOf(), 0)
        assertThat(actual, equalTo(expected))
    }
}
