package g0901_1000.s0984_string_without_aaa_or_bbb

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun strWithout3a3b() {
        assertThat(Solution().strWithout3a3b(1, 2), equalTo("bba"))
    }

    @Test
    fun strWithout3a3b2() {
        assertThat(Solution().strWithout3a3b(4, 1), equalTo("aabaa"))
    }
}
