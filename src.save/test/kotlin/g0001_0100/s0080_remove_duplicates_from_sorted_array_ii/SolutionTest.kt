package g0001_0100.s0080_remove_duplicates_from_sorted_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeDuplicates() {
        val array = intArrayOf(1, 1, 1, 2, 2, 3)
        val end = Solution().removeDuplicates(array)
        assertThat(array.copyOfRange(0, end), equalTo(intArrayOf(1, 1, 2, 2, 3)))
    }

    @Test
    fun removeDuplicates2() {
        val array = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        val end = Solution().removeDuplicates(array)
        assertThat(array.copyOfRange(0, end), equalTo(intArrayOf(0, 0, 1, 1, 2, 3, 3)))
    }
}
