package g3001_3100.s3076_shortest_uncommon_substring_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestSubstrings() {
        assertThat(
            Solution().shortestSubstrings(arrayOf("cab", "ad", "bad", "c")),
            equalTo(arrayOf<String?>("ab", "", "ba", ""))
        )
    }

    @Test
    fun shortestSubstrings2() {
        assertThat(
            Solution().shortestSubstrings(arrayOf("abc", "bcd", "abcd")),
            equalTo(arrayOf<String?>("", "", "abcd"))
        )
    }
}
