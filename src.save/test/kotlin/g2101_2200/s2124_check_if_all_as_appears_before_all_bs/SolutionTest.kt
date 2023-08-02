package g2101_2200.s2124_check_if_all_as_appears_before_all_bs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkString() {
        assertThat(Solution().checkString("aaabbb"), equalTo(true))
    }

    @Test
    fun checkString2() {
        assertThat(Solution().checkString("abab"), equalTo(false))
    }

    @Test
    fun checkString3() {
        assertThat(Solution().checkString("bbb"), equalTo(true))
    }
}
