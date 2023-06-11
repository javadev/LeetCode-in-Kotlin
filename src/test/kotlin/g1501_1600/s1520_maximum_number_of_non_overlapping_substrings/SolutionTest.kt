package g1501_1600.s1520_maximum_number_of_non_overlapping_substrings

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumOfSubstrings() {
        MatcherAssert.assertThat(
            Solution().maxNumOfSubstrings("adefaddaccc"),
            CoreMatchers.equalTo(mutableListOf("e", "f", "ccc"))
        )
    }

    @Test
    fun maxNumOfSubstrings2() {
        MatcherAssert.assertThat(
            Solution().maxNumOfSubstrings("abbaccd"),
            CoreMatchers.equalTo(mutableListOf("bb", "cc", "d"))
        )
    }
}
