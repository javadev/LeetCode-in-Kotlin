package g1901_2000.s1945_sum_of_digits_of_string_after_convert

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lucky() {
        assertThat(Solution().getLucky("iiii", 1), equalTo(36))
    }

    @Test
    fun lucky2() {
        assertThat(Solution().getLucky("leetcode", 2), equalTo(6))
    }

    @Test
    fun lucky3() {
        assertThat(Solution().getLucky("zbax", 2), equalTo(8))
    }
}
