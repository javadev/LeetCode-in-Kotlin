package g2001_2100.s2048_next_greater_numerically_balanced_number

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextBeautifulNumber() {
        MatcherAssert.assertThat(Solution().nextBeautifulNumber(1), CoreMatchers.equalTo(22))
    }

    @Test
    fun nextBeautifulNumber2() {
        MatcherAssert.assertThat(Solution().nextBeautifulNumber(1000), CoreMatchers.equalTo(1333))
    }

    @Test
    fun nextBeautifulNumber3() {
        MatcherAssert.assertThat(Solution().nextBeautifulNumber(3000), CoreMatchers.equalTo(3133))
    }
}
