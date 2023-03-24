package g0801_0900.s0820_short_encoding_of_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumLengthEncoding() {
        assertThat(
            Solution().minimumLengthEncoding(arrayOf("time", "me", "bell")),
            equalTo(10)
        )
    }

    @Test
    fun minimumLengthEncoding2() {
        assertThat(Solution().minimumLengthEncoding(arrayOf("t")), equalTo(2))
    }
}
