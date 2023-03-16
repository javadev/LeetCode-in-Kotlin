package g0801_0900.s0804_unique_morse_code_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniqueMorseRepresentations() {
        assertThat(
            Solution()
                .uniqueMorseRepresentations(arrayOf("gin", "zen", "gig", "msg")),
            equalTo(2)
        )
    }

    @Test
    fun uniqueMorseRepresentations2() {
        assertThat(Solution().uniqueMorseRepresentations(arrayOf("a")), equalTo(1))
    }
}
