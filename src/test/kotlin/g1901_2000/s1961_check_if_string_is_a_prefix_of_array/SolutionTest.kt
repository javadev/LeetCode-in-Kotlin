package g1901_2000.s1961_check_if_string_is_a_prefix_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPrefixString() {
        assertThat(
            Solution()
                .isPrefixString(
                    "iloveleetcode",
                    arrayOf("i", "love", "leetcode", "apples"),
                ),
            equalTo(true),
        )
    }

    @Test
    fun isPrefixString2() {
        assertThat(
            Solution()
                .isPrefixString(
                    "iloveleetcode",
                    arrayOf("apples", "i", "love", "leetcode"),
                ),
            equalTo(false),
        )
    }
}
