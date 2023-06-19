package g1901_2000.s1945_sum_of_digits_of_string_after_convert

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val lucky: Unit
        get() {
            assertThat(Solution().getLucky("iiii", 1), equalTo(36))
        }

    @get:Test
    val lucky2: Unit
        get() {
            assertThat(Solution().getLucky("leetcode", 2), equalTo(6))
        }

    @get:Test
    val lucky3: Unit
        get() {
            assertThat(Solution().getLucky("zbax", 2), equalTo(8))
        }
}
