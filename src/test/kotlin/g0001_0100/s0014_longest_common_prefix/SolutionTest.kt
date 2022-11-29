package g0001_0100.s0014_longest_common_prefix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestCommonPrefix() {
        assertThat(
            Solution().longestCommonPrefix(arrayOf("flower", "flow", "flight")),
            equalTo("fl")
        )
    }

    @Test
    fun longestCommonPrefix2() {
        assertThat(
            Solution().longestCommonPrefix(arrayOf("dog", "racecar", "car")),
            equalTo("")
        )
    }
}
