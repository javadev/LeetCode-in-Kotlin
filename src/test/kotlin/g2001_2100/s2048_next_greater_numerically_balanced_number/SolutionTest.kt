package g2001_2100.s2048_next_greater_numerically_balanced_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextBeautifulNumber() {
        assertThat(Solution().nextBeautifulNumber(1), equalTo(22))
    }

    @Test
    fun nextBeautifulNumber2() {
        assertThat(Solution().nextBeautifulNumber(1000), equalTo(1333))
    }

    @Test
    fun nextBeautifulNumber3() {
        assertThat(Solution().nextBeautifulNumber(3000), equalTo(3133))
    }
}
