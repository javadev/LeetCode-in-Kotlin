package g0701_0800.s0796_rotate_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotateString() {
        assertThat(Solution().rotateString("abcde", "cdeab"), equalTo(true))
    }

    @Test
    fun rotateString2() {
        assertThat(Solution().rotateString("abcde", "abced"), equalTo(false))
    }
}
