package g2101_2200.s2185_counting_words_with_a_given_prefix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun prefixCount() {
        assertThat(
            Solution()
                .prefixCount(arrayOf("pay", "attention", "practice", "attend"), "at"),
            equalTo(2),
        )
    }

    @Test
    fun prefixCount2() {
        assertThat(
            Solution()
                .prefixCount(arrayOf("leetcode", "win", "loops", "success"), "code"),
            equalTo(0),
        )
    }
}
