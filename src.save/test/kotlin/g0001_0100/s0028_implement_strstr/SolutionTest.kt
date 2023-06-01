package g0001_0100.s0028_implement_strstr

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun strStr() {
        assertThat(Solution().strStr("hello", "ll"), equalTo(2))
    }

    @Test
    fun strStr2() {
        assertThat(Solution().strStr("hello", ""), equalTo(0))
    }

    @Test
    fun strStr3() {
        assertThat(Solution().strStr("hello", "oo"), equalTo(-1))
    }
}
