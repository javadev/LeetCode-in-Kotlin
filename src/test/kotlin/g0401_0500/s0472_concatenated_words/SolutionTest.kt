package g0401_0500.s0472_concatenated_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findAllConcatenatedWordsInADict() {
        assertThat(
            Solution()
                .findAllConcatenatedWordsInADict(
                    arrayOf("cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat")
                ),
            equalTo(
                arrayOf("dogcatsdog", "catsdogcats", "ratcatdogcat").toList()
            )
        )
    }

    @Test
    fun findAllConcatenatedWordsInADict2() {
        assertThat(
            Solution()
                .findAllConcatenatedWordsInADict(
                    arrayOf("cat", "dog", "catdog")
                ),
            equalTo(
                arrayOf("catdog").toList()
            )
        )
    }
}
