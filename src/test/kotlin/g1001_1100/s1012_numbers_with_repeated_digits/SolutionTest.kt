package g1001_1100.s1012_numbers_with_repeated_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numDupDigitsAtMostN() {
        assertThat(Solution().numDupDigitsAtMostN(20), equalTo(1))
    }

    @Test
    fun numDupDigitsAtMostN2() {
        assertThat(Solution().numDupDigitsAtMostN(100), equalTo(10))
    }

    @Test
    fun numDupDigitsAtMostN3() {
        assertThat(Solution().numDupDigitsAtMostN(1000), equalTo(262))
    }
}
