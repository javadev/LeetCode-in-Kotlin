package g0701_0800.s0724_find_pivot_index

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pivotIndex() {
        assertThat(Solution().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)), equalTo(3))
    }

    @Test
    fun pivotIndex2() {
        assertThat(Solution().pivotIndex(intArrayOf(1, 2, 3)), equalTo(-1))
    }

    @Test
    fun pivotIndex3() {
        assertThat(Solution().pivotIndex(intArrayOf(2, 1, -1)), equalTo(0))
    }
}
