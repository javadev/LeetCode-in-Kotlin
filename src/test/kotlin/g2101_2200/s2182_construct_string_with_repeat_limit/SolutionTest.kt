package g2101_2200.s2182_construct_string_with_repeat_limit

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun repeatLimitedString() {
        MatcherAssert.assertThat(Solution().repeatLimitedString("cczazcc", 3), CoreMatchers.equalTo("zzcccac"))
    }

    @Test
    fun repeatLimitedString2() {
        MatcherAssert.assertThat(Solution().repeatLimitedString("aababab", 2), CoreMatchers.equalTo("bbabaa"))
    }
}
