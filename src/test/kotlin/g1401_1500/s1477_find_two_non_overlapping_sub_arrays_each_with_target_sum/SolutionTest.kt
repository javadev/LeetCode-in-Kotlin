package g1401_1500.s1477_find_two_non_overlapping_sub_arrays_each_with_target_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSumOfLengths() {
        assertThat(Solution().minSumOfLengths(intArrayOf(3, 2, 2, 4, 3), 3), equalTo(2))
    }

    @Test
    fun minSumOfLengths2() {
        assertThat(Solution().minSumOfLengths(intArrayOf(7, 3, 4, 7), 7), equalTo(2))
    }

    @Test
    fun minSumOfLengths3() {
        assertThat(
            Solution().minSumOfLengths(intArrayOf(4, 3, 2, 6, 2, 3, 4), 6),
            equalTo(-1),
        )
    }
}
