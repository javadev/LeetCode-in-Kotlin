package g2501_2600.s2535_difference_between_element_sum_and_digit_sum_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun differenceOfSum() {
        assertThat(Solution().differenceOfSum(intArrayOf(1, 15, 6, 3)), equalTo(9))
    }

    @Test
    fun differenceOfSum2() {
        assertThat(Solution().differenceOfSum(intArrayOf(1, 2, 3, 4)), equalTo(0))
    }
}
