package g1401_1500.s1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPrefixOfWord() {
        assertThat(Solution().isPrefixOfWord("i love eating burger", "burg"), equalTo(4))
    }

    @Test
    fun isPrefixOfWord2() {
        assertThat(
            Solution().isPrefixOfWord("this problem is an easy problem", "pro"),
            equalTo(2),
        )
    }

    @Test
    fun isPrefixOfWord3() {
        assertThat(Solution().isPrefixOfWord("i am tired", "you"), equalTo(-1))
    }
}
