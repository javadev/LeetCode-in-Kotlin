package g1401_1500.s1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isPrefixOfWord: Unit
        get() {
            assertThat(Solution().isPrefixOfWord("i love eating burger", "burg"), equalTo(4))
        }

    @get:Test
    val isPrefixOfWord2: Unit
        get() {
            assertThat(
                Solution().isPrefixOfWord("this problem is an easy problem", "pro"),
                equalTo(2)
            )
        }

    @get:Test
    val isPrefixOfWord3: Unit
        get() {
            assertThat(Solution().isPrefixOfWord("i am tired", "you"), equalTo(-1))
        }
}
