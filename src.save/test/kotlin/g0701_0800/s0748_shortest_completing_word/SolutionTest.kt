package g0701_0800.s0748_shortest_completing_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestCompletingWord() {
        assertThat(
            Solution()
                .shortestCompletingWord(
                    "1s3 PSt", arrayOf("step", "steps", "stripe", "stepple")
                ),
            equalTo("steps")
        )
    }

    @Test
    fun shortestCompletingWord2() {
        assertThat(
            Solution()
                .shortestCompletingWord(
                    "1s3 456", arrayOf("looks", "pest", "stew", "show")
                ),
            equalTo("pest")
        )
    }
}
