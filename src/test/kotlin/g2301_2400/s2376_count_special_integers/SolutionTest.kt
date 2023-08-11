package g2301_2400.s2376_count_special_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSpecialNumbers() {
        assertThat(Solution().countSpecialNumbers(20), equalTo(19))
    }

    @Test
    fun countSpecialNumbers2() {
        assertThat(Solution().countSpecialNumbers(5), equalTo(5))
    }

    @Test
    fun countSpecialNumbers3() {
        assertThat(Solution().countSpecialNumbers(135), equalTo(110))
    }
}
