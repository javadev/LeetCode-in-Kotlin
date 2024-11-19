package g2501_2600.s2570_merge_two_2d_arrays_by_summing_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeArrays() {
        assertThat(
            Solution().mergeArrays(
                arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 5)),
                arrayOf(intArrayOf(1, 4), intArrayOf(3, 2), intArrayOf(4, 1)),
            ),
            equalTo(arrayOf(intArrayOf(1, 6), intArrayOf(2, 3), intArrayOf(3, 2), intArrayOf(4, 6))),
        )
    }

    @Test
    fun mergeArrays2() {
        assertThat(
            Solution().mergeArrays(
                arrayOf(intArrayOf(2, 4), intArrayOf(3, 6), intArrayOf(5, 5)),
                arrayOf(intArrayOf(1, 3), intArrayOf(4, 3)),
            ),
            equalTo(arrayOf(intArrayOf(1, 3), intArrayOf(2, 4), intArrayOf(3, 6), intArrayOf(4, 3), intArrayOf(5, 5))),
        )
    }
}
