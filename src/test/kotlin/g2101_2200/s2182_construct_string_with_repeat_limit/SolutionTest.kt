package g2101_2200.s2182_construct_string_with_repeat_limit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun repeatLimitedString() {
        assertThat(Solution().repeatLimitedString("cczazcc", 3), equalTo("zzcccac"))
    }

    @Test
    fun repeatLimitedString2() {
        assertThat(Solution().repeatLimitedString("aababab", 2), equalTo("bbabaa"))
    }
}
