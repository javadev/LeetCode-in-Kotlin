package g0001_0100.s0058_length_of_last_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lengthOfLastWord() {
        assertThat(Solution().lengthOfLastWord("Hello World"), equalTo(5))
    }

    @Test
    fun lengthOfLastWord2() {
        assertThat(Solution().lengthOfLastWord("   fly me   to   the moon  "), equalTo(4))
    }

    @Test
    fun lengthOfLastWord3() {
        assertThat(Solution().lengthOfLastWord("luffy is still joyboy"), equalTo(6))
    }
}
