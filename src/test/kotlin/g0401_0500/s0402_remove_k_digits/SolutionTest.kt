package g0401_0500.s0402_remove_k_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeKdigits() {
        assertThat(Solution().removeKdigits("1432219", 3), equalTo("1219"))
    }

    @Test
    fun removeKdigits2() {
        assertThat(Solution().removeKdigits("10200", 1), equalTo("200"))
    }

    @Test
    fun removeKdigits3() {
        assertThat(Solution().removeKdigits("10", 2), equalTo("0"))
    }
}
