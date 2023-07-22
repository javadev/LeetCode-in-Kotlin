package g2201_2300.s2283_check_if_number_has_equal_digit_count_and_digit_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun digitCount() {
        assertThat(Solution().digitCount("1210"), equalTo(true))
    }

    @Test
    fun digitCount2() {
        assertThat(Solution().digitCount("030"), equalTo(false))
    }
}
