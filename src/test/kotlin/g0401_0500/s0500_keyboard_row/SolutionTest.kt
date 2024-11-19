package g0401_0500.s0500_keyboard_row

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findWords() {
        assertThat(
            Solution().findWords(arrayOf("Hello", "Alaska", "Dad", "Peace")),
            equalTo(arrayOf("Alaska", "Dad")),
        )
    }

    @Test
    fun findWords2() {
        assertThat(Solution().findWords(arrayOf("omk")), equalTo(arrayOf<String>()))
    }

    @Test
    fun findWords3() {
        assertThat(
            Solution().findWords(arrayOf("adsdf", "sfd")),
            equalTo(arrayOf("adsdf", "sfd")),
        )
    }
}
