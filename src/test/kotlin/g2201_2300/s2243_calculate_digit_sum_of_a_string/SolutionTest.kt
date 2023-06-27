package g2201_2300.s2243_calculate_digit_sum_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun digitSum() {
        assertThat(Solution().digitSum("11111222223", 3), equalTo("135"))
    }

    @Test
    fun digitSum2() {
        assertThat(Solution().digitSum("00000000", 3), equalTo("000"))
    }
}
