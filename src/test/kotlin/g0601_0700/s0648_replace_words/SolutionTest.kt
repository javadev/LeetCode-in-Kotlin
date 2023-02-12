package g0601_0700.s0648_replace_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun replaceWords() {
        assertThat(
            Solution()
                .replaceWords(
                    listOf("cat", "bat", "rat"),
                    "the cattle was rattled by the battery"
                ),
            equalTo("the cat was rat by the bat")
        )
    }

    @Test
    fun replaceWords2() {
        assertThat(
            Solution()
                .replaceWords(listOf("a", "b", "c"), "aadsfasf absbs bbab cadsfafs"),
            equalTo("a a b c")
        )
    }
}
