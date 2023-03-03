package g0401_0500.s0467_unique_substrings_in_wraparound_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findSubstringInWraproundString() {
        assertThat(Solution().findSubstringInWraproundString("a"), equalTo(1))
    }

    @Test
    fun findSubstringInWraproundString2() {
        assertThat(Solution().findSubstringInWraproundString("cac"), equalTo(2))
    }

    @Test
    fun findSubstringInWraproundString3() {
        assertThat(Solution().findSubstringInWraproundString("zab"), equalTo(6))
    }
}
