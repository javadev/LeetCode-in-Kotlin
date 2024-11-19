package g3001_3100.s3043_find_the_length_of_the_longest_common_prefix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestCommonPrefix() {
        assertThat(
            Solution().longestCommonPrefix(intArrayOf(1, 10, 100), intArrayOf(1000)),
            equalTo(3),
        )
    }

    @Test
    fun longestCommonPrefix2() {
        assertThat(
            Solution().longestCommonPrefix(intArrayOf(1, 2, 3), intArrayOf(4, 4, 4)),
            equalTo(0),
        )
    }
}
