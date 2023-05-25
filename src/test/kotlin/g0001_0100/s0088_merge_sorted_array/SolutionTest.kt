package g0001_0100.s0088_merge_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun merge() {
        val array = intArrayOf(1, 2, 3, 0, 0, 0)
        Solution().merge(array, 3, intArrayOf(2, 5, 6), 3)
        assertThat(array, equalTo(intArrayOf(1, 2, 2, 3, 5, 6)))
    }

    @Test
    fun merge2() {
        val array = intArrayOf(1)
        Solution().merge(array, 1, intArrayOf(), 0)
        assertThat(array, equalTo(intArrayOf(1)))
    }
}
