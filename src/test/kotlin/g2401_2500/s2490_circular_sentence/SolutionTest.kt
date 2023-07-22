package g2401_2500.s2490_circular_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isCircularSentence() {
        assertThat(
            Solution().isCircularSentence("leetcode exercises sound delightful"),
            equalTo(true)
        )
    }

    @Test
    fun isCircularSentence2() {
        assertThat(Solution().isCircularSentence("eetcode"), equalTo(true))
    }

    @Test
    fun isCircularSentence3() {
        assertThat(Solution().isCircularSentence("Leetcode is cool"), equalTo(false))
    }
}
