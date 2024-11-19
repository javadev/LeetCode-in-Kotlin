package g1801_1900.s1813_sentence_similarity_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areSentencesSimilar() {
        assertThat(
            Solution().areSentencesSimilar("My name is Haley", "My Haley"),
            equalTo(true),
        )
    }

    @Test
    fun areSentencesSimilar2() {
        assertThat(Solution().areSentencesSimilar("of", "A lot of words"), equalTo(false))
    }

    @Test
    fun areSentencesSimilar3() {
        assertThat(
            Solution().areSentencesSimilar("Eating right now", "Eating"),
            equalTo(true),
        )
    }
}
