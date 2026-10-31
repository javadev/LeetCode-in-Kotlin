package g3701_3800.s3775_reverse_words_with_same_vowel_count

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseWords() {
        assertThat<String>(
            Solution().reverseWords("cat and mice"),
            equalTo<String>("cat dna mice"),
        )
    }

    @Test
    fun reverseWords2() {
        assertThat<String>(
            Solution().reverseWords("book is nice"),
            equalTo<String>("book is ecin"),
        )
    }

    @Test
    fun reverseWords3() {
        assertThat<String>(
            Solution().reverseWords("banana healthy"),
            equalTo<String>("banana healthy"),
        )
    }
}
