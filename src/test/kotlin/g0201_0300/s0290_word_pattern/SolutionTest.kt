package g0201_0300.s0290_word_pattern

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wordPattern() {
        assertThat(Solution().wordPattern("abba", "dog cat cat dog"), equalTo(true))
    }

    @Test
    fun wordPattern2() {
        assertThat(Solution().wordPattern("abba", "dog cat cat fish"), equalTo(false))
    }

    @Test
    fun wordPattern3() {
        assertThat(Solution().wordPattern("aaaa", "dog cat cat dog"), equalTo(false))
    }

    @Test
    fun wordPattern4() {
        assertThat(Solution().wordPattern("abba", "dog dog dog dog"), equalTo(false))
    }
}
