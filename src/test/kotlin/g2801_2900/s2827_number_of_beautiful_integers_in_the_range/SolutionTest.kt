package g2801_2900.s2827_number_of_beautiful_integers_in_the_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfBeautifulIntegers() {
        assertThat(Solution().numberOfBeautifulIntegers(10, 20, 3), equalTo(2))
    }

    @Test
    fun numberOfBeautifulIntegers2() {
        assertThat(Solution().numberOfBeautifulIntegers(1, 10, 1), equalTo(1))
    }

    @Test
    fun numberOfBeautifulIntegers3() {
        assertThat(Solution().numberOfBeautifulIntegers(5, 5, 2), equalTo(0))
    }
}
