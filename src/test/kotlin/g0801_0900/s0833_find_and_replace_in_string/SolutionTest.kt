package g0801_0900.s0833_find_and_replace_in_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findReplaceString() {
        assertThat(
            Solution()
                .findReplaceString(
                    "abcd",
                    intArrayOf(0, 2),
                    arrayOf("a", "cd"),
                    arrayOf("eee", "ffff"),
                ),
            equalTo("eeebffff"),
        )
    }

    @Test
    fun findReplaceString2() {
        assertThat(
            Solution()
                .findReplaceString(
                    "abcd",
                    intArrayOf(0, 2),
                    arrayOf("ab", "ec"),
                    arrayOf("eee", "ffff"),
                ),
            equalTo("eeecd"),
        )
    }
}
