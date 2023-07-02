package g0301_0400.s0324_wiggle_sort_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wiggleSort() {
        val array = intArrayOf(1, 5, 1, 1, 6, 4)
        Solution().wiggleSort(array)
        assertThat(array, equalTo(intArrayOf(1, 6, 1, 5, 1, 4)))
    }

    @Test
    fun wiggleSort2() {
        val array = intArrayOf(1, 3, 2, 2, 3, 1)
        Solution().wiggleSort(array)
        assertThat(array, equalTo(intArrayOf(2, 3, 1, 3, 1, 2)))
    }
}
