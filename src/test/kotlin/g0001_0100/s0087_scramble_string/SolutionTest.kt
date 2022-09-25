package g0001_0100.s0087_scramble_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isScramble() {
        assertThat(Solution().isScramble("great", "rgeat"), equalTo(true))
    }

    @Test
    fun isScramble2() {
        assertThat(Solution().isScramble("abcde", "caebd"), equalTo(false))
    }

    @Test
    fun isScramble3() {
        assertThat(Solution().isScramble("a", "a"), equalTo(true))
    }
}
