package g2401_2500.s2486_append_characters_to_string_to_make_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun appendCharacters() {
        assertThat(Solution().appendCharacters("coaching", "coding"), equalTo(4))
    }

    @Test
    fun appendCharacters2() {
        assertThat(Solution().appendCharacters("abcde", "a"), equalTo(0))
    }

    @Test
    fun appendCharacters3() {
        assertThat(Solution().appendCharacters("z", "abcde"), equalTo(5))
    }
}
