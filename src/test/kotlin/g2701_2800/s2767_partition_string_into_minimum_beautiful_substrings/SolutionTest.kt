package g2701_2800.s2767_partition_string_into_minimum_beautiful_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumBeautifulSubstrings() {
        assertThat(Solution().minimumBeautifulSubstrings("1011"), equalTo(2))
    }

    @Test
    fun minimumBeautifulSubstrings2() {
        assertThat(Solution().minimumBeautifulSubstrings("0"), equalTo(-1))
    }
}
