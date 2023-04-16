package g0901_1000.s0916_word_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wordSubsets() {
        assertThat(
            Solution()
                .wordSubsets(arrayOf("amazon", "apple", "facebook", "google", "leetcode"), arrayOf("e", "o")),
            equalTo(listOf("facebook", "google", "leetcode"))
        )
    }

    @Test
    fun wordSubsets2() {
        assertThat(
            Solution()
                .wordSubsets(arrayOf("amazon", "apple", "facebook", "google", "leetcode"), arrayOf("l", "e")),
            equalTo(listOf("apple", "google", "leetcode"))
        )
    }
}
