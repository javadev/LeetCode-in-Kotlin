package g2501_2600.s2506_count_pairs_of_similar_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun similarPairs() {
        assertThat(
            Solution().similarPairs(arrayOf("aba", "aabb", "abcd", "bac", "aabc")),
            equalTo(2),
        )
    }

    @Test
    fun similarPairs2() {
        assertThat(Solution().similarPairs(arrayOf("aabb", "ab", "ba")), equalTo(3))
    }

    @Test
    fun similarPairs3() {
        assertThat(Solution().similarPairs(arrayOf("nba", "cba", "dba")), equalTo(0))
    }
}
