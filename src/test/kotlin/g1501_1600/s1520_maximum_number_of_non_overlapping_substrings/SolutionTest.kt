package g1501_1600.s1520_maximum_number_of_non_overlapping_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumOfSubstrings() {
        assertThat(
            Solution().maxNumOfSubstrings("adefaddaccc"),
            equalTo(mutableListOf("e", "f", "ccc"))
        )
    }

    @Test
    fun maxNumOfSubstrings2() {
        assertThat(
            Solution().maxNumOfSubstrings("abbaccd"),
            equalTo(mutableListOf("bb", "cc", "d"))
        )
    }
}
