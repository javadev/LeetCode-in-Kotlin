package g2601_2700.s2605_form_smallest_number_from_two_digit_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minNumber() {
        assertThat(Solution().minNumber(intArrayOf(4, 1, 3), intArrayOf(5, 7)), equalTo(15))
    }

    @Test
    fun minNumber2() {
        assertThat(Solution().minNumber(intArrayOf(3, 5, 2, 6), intArrayOf(3, 1, 7)), equalTo(3))
    }
}
