package g1701_1800.s1780_check_if_number_is_a_sum_of_powers_of_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkPowersOfThree() {
        assertThat(Solution().checkPowersOfThree(12), equalTo(true))
    }

    @Test
    fun checkPowersOfThree2() {
        assertThat(Solution().checkPowersOfThree(91), equalTo(true))
    }

    @Test
    fun checkPowersOfThree3() {
        assertThat(Solution().checkPowersOfThree(21), equalTo(false))
    }
}
