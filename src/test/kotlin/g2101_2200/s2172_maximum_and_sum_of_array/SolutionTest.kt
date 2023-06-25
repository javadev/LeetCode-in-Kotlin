package g2101_2200.s2172_maximum_and_sum_of_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumANDSum() {
        MatcherAssert.assertThat(Solution().maximumANDSum(intArrayOf(1, 2, 3, 4, 5, 6), 3), CoreMatchers.equalTo(9))
    }

    @Test
    fun maximumANDSum2() {
        MatcherAssert.assertThat(Solution().maximumANDSum(intArrayOf(1, 3, 10, 4, 7, 1), 9), CoreMatchers.equalTo(24))
    }
}
