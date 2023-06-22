package g2001_2100.s2030_smallest_k_length_subsequence_with_occurrences_of_a_letter

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestSubsequence() {
        MatcherAssert.assertThat(Solution().smallestSubsequence("leet", 3, 'e', 1), CoreMatchers.equalTo("eet"))
    }

    @Test
    fun smallestSubsequence2() {
        MatcherAssert.assertThat(Solution().smallestSubsequence("leetcode", 4, 'e', 2), CoreMatchers.equalTo("ecde"))
    }

    @Test
    fun smallestSubsequence3() {
        MatcherAssert.assertThat(Solution().smallestSubsequence("bb", 2, 'b', 2), CoreMatchers.equalTo("bb"))
    }
}
