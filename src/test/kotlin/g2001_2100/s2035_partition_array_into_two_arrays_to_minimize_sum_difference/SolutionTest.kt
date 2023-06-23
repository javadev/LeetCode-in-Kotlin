package g2001_2100.s2035_partition_array_into_two_arrays_to_minimize_sum_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDifference() {
        assertThat(Solution().minimumDifference(intArrayOf(3, 9, 7, 3)), equalTo(2))
    }

    @Test
    fun minimumDifference2() {
        assertThat(Solution().minimumDifference(intArrayOf(-36, 36)), equalTo(72))
    }

    @Test
    fun minimumDifference3() {
        assertThat(Solution().minimumDifference(intArrayOf(2, -1, 0, 4, -2, -9)), equalTo(0))
    }
}
