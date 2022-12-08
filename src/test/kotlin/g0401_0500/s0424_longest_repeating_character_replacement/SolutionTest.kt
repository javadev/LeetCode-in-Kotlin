package g0401_0500.s0424_longest_repeating_character_replacement

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun characterReplacement() {
        assertThat(Solution().characterReplacement("ABAB", 2), equalTo(4))
    }

    @Test
    fun characterReplacement2() {
        assertThat(Solution().characterReplacement("AABABBA", 1), equalTo(4))
    }
}
