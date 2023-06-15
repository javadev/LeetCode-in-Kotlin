package g1601_1700.s1663_smallest_string_with_a_given_numeric_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestString() {
        assertThat(Solution().getSmallestString(3, 27), equalTo("aay"))
    }

    @Test
    fun smallestString2() {
        assertThat(Solution().getSmallestString(5, 73), equalTo("aaszz"))
    }
}
