package g2801_2900.s2811_check_if_it_is_possible_to_split_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canSplitArray() {
        assertThat(Solution().canSplitArray(mutableListOf(2, 2, 1), 4), equalTo(true))
    }

    @Test
    fun canSplitArray2() {
        assertThat(Solution().canSplitArray(mutableListOf(2, 1, 3), 5), equalTo(false))
    }

    @Test
    fun canSplitArray3() {
        assertThat(Solution().canSplitArray(mutableListOf(2, 3, 3, 2, 3), 6), equalTo(true))
    }
}
