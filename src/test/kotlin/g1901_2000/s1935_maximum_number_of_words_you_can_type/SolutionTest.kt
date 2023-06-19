package g1901_2000.s1935_maximum_number_of_words_you_can_type

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canBeTypedWords() {
        assertThat(Solution().canBeTypedWords("hello world", "ad"), equalTo(1))
    }

    @Test
    fun canBeTypedWords2() {
        assertThat(Solution().canBeTypedWords("leet code", "lt"), equalTo(1))
    }

    @Test
    fun canBeTypedWords3() {
        assertThat(Solution().canBeTypedWords("leet code", "e"), equalTo(0))
    }
}
