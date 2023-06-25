package g2101_2200.s2160_minimum_sum_of_four_digit_number_after_splitting_digits

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSum() {
        MatcherAssert.assertThat(Solution().minimumSum(2932), CoreMatchers.equalTo(52))
    }

    @Test
    fun minimumSum2() {
        MatcherAssert.assertThat(Solution().minimumSum(4009), CoreMatchers.equalTo(13))
    }
}
