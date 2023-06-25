package g2101_2200.s2185_counting_words_with_a_given_prefix

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun prefixCount() {
        MatcherAssert.assertThat(
            Solution()
                .prefixCount(arrayOf("pay", "attention", "practice", "attend"), "at"),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun prefixCount2() {
        MatcherAssert.assertThat(
            Solution()
                .prefixCount(arrayOf("leetcode", "win", "loops", "success"), "code"),
            CoreMatchers.equalTo(0)
        )
    }
}
