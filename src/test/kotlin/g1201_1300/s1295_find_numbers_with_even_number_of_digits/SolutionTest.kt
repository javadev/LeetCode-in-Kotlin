package g1201_1300.s1295_find_numbers_with_even_number_of_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findNumbers() {
        assertThat(Solution().findNumbers(intArrayOf(12, 345, 2, 6, 7896)), equalTo(2))
    }

    @Test
    fun findNumbers2() {
        assertThat(Solution().findNumbers(intArrayOf(555, 901, 482, 1771)), equalTo(1))
    }
}
