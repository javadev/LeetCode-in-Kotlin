package g1801_1900.s1816_truncate_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun truncateSentence() {
        assertThat(
            Solution().truncateSentence("Hello how are you Contestant", 4),
            equalTo("Hello how are you")
        )
    }

    @Test
    fun truncateSentence2() {
        assertThat(
            Solution().truncateSentence("What is the solution to this problem", 4),
            equalTo("What is the solution")
        )
    }

    @Test
    fun truncateSentence3() {
        assertThat(
            Solution().truncateSentence("chopper is not a tanuki", 5),
            equalTo("chopper is not a tanuki")
        )
    }
}
