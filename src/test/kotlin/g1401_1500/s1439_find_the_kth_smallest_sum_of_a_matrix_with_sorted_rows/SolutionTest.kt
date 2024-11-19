package g1401_1500.s1439_find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallest() {
        assertThat(Solution().kthSmallest(arrayOf(intArrayOf(1, 3, 11), intArrayOf(2, 4, 6)), 5), equalTo(7))
    }

    @Test
    fun kthSmallest2() {
        assertThat(Solution().kthSmallest(arrayOf(intArrayOf(1, 3, 11), intArrayOf(2, 4, 6)), 9), equalTo(17))
    }

    @Test
    fun kthSmallest3() {
        assertThat(
            Solution().kthSmallest(arrayOf(intArrayOf(1, 10, 10), intArrayOf(1, 4, 5), intArrayOf(2, 3, 6)), 7),
            equalTo(9),
        )
    }
}
