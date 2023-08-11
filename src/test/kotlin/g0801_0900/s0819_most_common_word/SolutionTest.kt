package g0801_0900.s0819_most_common_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostCommonWord() {
        assertThat(
            Solution()
                .mostCommonWord(
                    "Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit")
                ),
            equalTo("ball")
        )
    }

    @Test
    fun mostCommonWord2() {
        assertThat(Solution().mostCommonWord("a.", arrayOf()), equalTo("a"))
    }
}
