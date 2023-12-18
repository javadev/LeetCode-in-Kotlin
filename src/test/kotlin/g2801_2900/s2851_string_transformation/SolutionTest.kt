package g2801_2900.s2851_string_transformation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWays() {
        assertThat(Solution().numberOfWays("abcd", "cdab", 2), equalTo(2))
    }

    @Test
    fun numberOfWays2() {
        assertThat(Solution().numberOfWays("ababab", "ababab", 1), equalTo(2))
    }
}
