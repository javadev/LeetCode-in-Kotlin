package g1601_1700.s1684_count_the_number_of_consistent_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countConsistentStrings() {
        assertThat(
            Solution()
                .countConsistentStrings(
                    "ab",
                    arrayOf("ad", "bd", "aaab", "baa", "badab"),
                ),
            equalTo(2),
        )
    }

    @Test
    fun countConsistentStrings2() {
        assertThat(
            Solution()
                .countConsistentStrings(
                    "abc",
                    arrayOf("a", "b", "c", "ab", "ac", "bc", "abc"),
                ),
            equalTo(7),
        )
    }

    @Test
    fun countConsistentStrings3() {
        assertThat(
            Solution()
                .countConsistentStrings(
                    "cad",
                    arrayOf("cc", "acd", "b", "ba", "bac", "bad", "ac", "d"),
                ),
            equalTo(4),
        )
    }
}
