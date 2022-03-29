package g0001_0100.s0026_remove_duplicates_from_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun removeDuplicates() {
        val array = intArrayOf(1, 1, 2)
        val end = Solution().removeDuplicates(array)
        assertThat(Arrays.toString(Arrays.copyOfRange(array, 0, end)), equalTo("[1, 2]"))
    }
}
