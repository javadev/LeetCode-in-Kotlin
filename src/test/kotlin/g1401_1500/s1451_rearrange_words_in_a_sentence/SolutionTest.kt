package g1401_1500.s1451_rearrange_words_in_a_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arrangeWords() {
        assertThat(Solution().arrangeWords("Leetcode is cool"), equalTo("Is cool leetcode"))
    }

    @Test
    fun arrangeWords2() {
        assertThat(
            Solution().arrangeWords("Keep calm and code on"),
            equalTo("On and keep calm code")
        )
    }

    @Test
    fun arrangeWords3() {
        assertThat(
            Solution().arrangeWords("To be or not to be"), equalTo("To be or to be not")
        )
    }
}
