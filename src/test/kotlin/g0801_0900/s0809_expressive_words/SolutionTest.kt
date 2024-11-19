package g0801_0900.s0809_expressive_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun expressiveWords() {
        assertThat(
            Solution().expressiveWords("heeellooo", arrayOf("hello", "hi", "helo")),
            equalTo(1),
        )
    }

    @Test
    fun expressiveWords2() {
        assertThat(
            Solution().expressiveWords("zzzzzyyyyy", arrayOf("zzyy", "zy", "zyy")),
            equalTo(3),
        )
    }
}
