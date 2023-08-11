package g2201_2300.s2255_count_prefixes_of_a_given_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPrefixes() {
        assertThat(
            Solution()
                .countPrefixes(arrayOf("a", "b", "c", "ab", "bc", "abc"), "abc"),
            equalTo(3)
        )
    }

    @Test
    fun countPrefixes2() {
        assertThat(Solution().countPrefixes(arrayOf("a", "a"), "aa"), equalTo(2))
    }
}
