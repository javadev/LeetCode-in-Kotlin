package g1801_1900.s1859_sorting_the_sentence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortSentence() {
        assertThat(
            Solution().sortSentence("is2 sentence4 This1 a3"),
            equalTo("This is a sentence")
        )
    }

    @Test
    fun sortSentence2() {
        assertThat(
            Solution().sortSentence("Myself2 Me1 I4 and3"),
            equalTo("Me Myself and I")
        )
    }
}
