package g1901_2000.s1910_remove_all_occurrences_of_a_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeOccurrences() {
        assertThat(Solution().removeOccurrences("daabcbaabcbc", "abc"), equalTo("dab"))
    }

    @Test
    fun removeOccurrences2() {
        assertThat(Solution().removeOccurrences("axxxxyyyyb", "xy"), equalTo("ab"))
    }
}
