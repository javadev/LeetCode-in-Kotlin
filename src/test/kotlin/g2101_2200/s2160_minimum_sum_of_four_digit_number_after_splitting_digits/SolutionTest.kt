package g2101_2200.s2160_minimum_sum_of_four_digit_number_after_splitting_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSum() {
        assertThat(Solution().minimumSum(2932), equalTo(52))
    }

    @Test
    fun minimumSum2() {
        assertThat(Solution().minimumSum(4009), equalTo(13))
    }
}
