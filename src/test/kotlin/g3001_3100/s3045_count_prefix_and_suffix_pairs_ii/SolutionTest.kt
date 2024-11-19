package g3001_3100.s3045_count_prefix_and_suffix_pairs_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPrefixSuffixPairs() {
        assertThat(
            Solution().countPrefixSuffixPairs(arrayOf("a", "aba", "ababa", "aa")),
            equalTo(4L),
        )
    }

    @Test
    fun countPrefixSuffixPairs2() {
        assertThat(
            Solution().countPrefixSuffixPairs(arrayOf("pa", "papa", "ma", "mama")),
            equalTo(2L),
        )
    }

    @Test
    fun countPrefixSuffixPairs3() {
        assertThat(Solution().countPrefixSuffixPairs(arrayOf("abab", "ab")), equalTo(0L))
    }
}
