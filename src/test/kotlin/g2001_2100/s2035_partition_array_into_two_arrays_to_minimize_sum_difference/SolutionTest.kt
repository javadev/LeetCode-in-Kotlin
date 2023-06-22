package g2001_2100.s2035_partition_array_into_two_arrays_to_minimize_sum_difference

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDifference() {
        MatcherAssert.assertThat(Solution().minimumDifference(intArrayOf(3, 9, 7, 3)), CoreMatchers.equalTo(2))
    }

    @Test
    fun minimumDifference2() {
        MatcherAssert.assertThat(Solution().minimumDifference(intArrayOf(-36, 36)), CoreMatchers.equalTo(72))
    }

    @Test
    fun minimumDifference3() {
        MatcherAssert.assertThat(Solution().minimumDifference(intArrayOf(2, -1, 0, 4, -2, -9)), CoreMatchers.equalTo(0))
    }
}
