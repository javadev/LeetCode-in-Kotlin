package g1901_2000.s1941_check_if_all_characters_have_equal_number_of_occurrences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun areOccurrencesEqual() {
        assertThat(Solution().areOccurrencesEqual("abacbc"), equalTo(true))
    }

    @Test
    fun areOccurrencesEqual2() {
        assertThat(Solution().areOccurrencesEqual("aaabb"), equalTo(false))
    }
}
