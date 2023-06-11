package g1201_1300.s1297_maximum_number_of_occurrences_of_a_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxFreq() {
        assertThat(Solution().maxFreq("aababcaab", 2, 3, 4), equalTo(2))
    }

    @Test
    fun maxFreq2() {
        assertThat(Solution().maxFreq("aaaa", 1, 3, 3), equalTo(2))
    }
}
