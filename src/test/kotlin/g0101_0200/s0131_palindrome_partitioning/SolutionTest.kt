package g0101_0200.s0131_palindrome_partitioning

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partition() {
        assertThat(Solution().partition("aab"), equalTo(listOf(listOf("a", "a", "b"), listOf("aa", "b"))))
    }

    @Test
    fun partition2() {
        assertThat(Solution().partition("a"), equalTo(listOf(listOf("a"))))
    }
}
