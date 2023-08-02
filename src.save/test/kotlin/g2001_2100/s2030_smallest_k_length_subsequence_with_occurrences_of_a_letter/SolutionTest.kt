package g2001_2100.s2030_smallest_k_length_subsequence_with_occurrences_of_a_letter

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestSubsequence() {
        assertThat(Solution().smallestSubsequence("leet", 3, 'e', 1), equalTo("eet"))
    }

    @Test
    fun smallestSubsequence2() {
        assertThat(Solution().smallestSubsequence("leetcode", 4, 'e', 2), equalTo("ecde"))
    }

    @Test
    fun smallestSubsequence3() {
        assertThat(Solution().smallestSubsequence("bb", 2, 'b', 2), equalTo("bb"))
    }
}
