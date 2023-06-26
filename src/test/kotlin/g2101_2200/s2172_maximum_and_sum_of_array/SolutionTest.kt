package g2101_2200.s2172_maximum_and_sum_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumANDSum() {
        assertThat(Solution().maximumANDSum(intArrayOf(1, 2, 3, 4, 5, 6), 3), equalTo(9))
    }

    @Test
    fun maximumANDSum2() {
        assertThat(Solution().maximumANDSum(intArrayOf(1, 3, 10, 4, 7, 1), 9), equalTo(24))
    }
}
