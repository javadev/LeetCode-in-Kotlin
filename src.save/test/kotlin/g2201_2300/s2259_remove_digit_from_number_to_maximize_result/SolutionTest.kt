package g2201_2300.s2259_remove_digit_from_number_to_maximize_result

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeDigit() {
        assertThat(Solution().removeDigit("123", '3'), equalTo("12"))
    }

    @Test
    fun removeDigit2() {
        assertThat(Solution().removeDigit("1231", '1'), equalTo("231"))
    }

    @Test
    fun removeDigit3() {
        assertThat(Solution().removeDigit("551", '5'), equalTo("51"))
    }
}
