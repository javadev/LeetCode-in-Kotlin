package g0001_0100.s0026_remove_duplicates_from_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeDuplicates() {
        val array = intArrayOf(1, 1, 2)
        val end = Solution().removeDuplicates(array)
        assertThat(array.copyOfRange(0, end), equalTo(intArrayOf(1, 2)))
    }

    @Test
    fun removeDuplicates2() {
        val array = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val end = Solution().removeDuplicates(array)
        assertThat(array.copyOfRange(0, end), equalTo(intArrayOf(0, 1, 2, 3, 4)))
    }
}
