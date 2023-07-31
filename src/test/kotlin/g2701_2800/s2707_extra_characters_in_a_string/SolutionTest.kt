package g2701_2800.s2707_extra_characters_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minExtraChar() {
        assertThat(
            Solution().minExtraChar("leetscode", arrayOf("leet", "code", "leetcode")),
            equalTo(1)
        )
    }

    @Test
    fun minExtraChar2() {
        assertThat(
            Solution().minExtraChar("sayhelloworld", arrayOf("hello", "world")),
            equalTo(3)
        )
    }
}
