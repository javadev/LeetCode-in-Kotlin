package g2401_2500.s2455_average_value_of_even_numbers_that_are_divisible_by_three

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun averageValue() {
        assertThat(Solution().averageValue(intArrayOf(1, 3, 6, 10, 12, 15)), equalTo(9))
    }

    @Test
    fun averageValue2() {
        assertThat(Solution().averageValue(intArrayOf(1, 2, 4, 7, 10)), equalTo(0))
    }
}
