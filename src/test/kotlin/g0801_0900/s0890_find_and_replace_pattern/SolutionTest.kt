package g0801_0900.s0890_find_and_replace_pattern

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findAndReplacePattern() {
        assertThat(
            Solution()
                .findAndReplacePattern(arrayOf("abc", "deq", "mee", "aqq", "dkd", "ccc"), "abb"),
            equalTo(listOf("mee", "aqq")),
        )
    }

    @Test
    fun findAndReplacePattern2() {
        assertThat(
            Solution().findAndReplacePattern(arrayOf("a", "b", "c"), "a"),
            equalTo(listOf("a", "b", "c")),
        )
    }
}
