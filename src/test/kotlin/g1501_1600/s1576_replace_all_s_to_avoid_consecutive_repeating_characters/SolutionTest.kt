package g1501_1600.s1576_replace_all_s_to_avoid_consecutive_repeating_characters

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun modifyString() {
        MatcherAssert.assertThat(Solution().modifyString("?zs"), CoreMatchers.equalTo("azs"))
    }

    @Test
    fun modifyString2() {
        MatcherAssert.assertThat(Solution().modifyString("ubv?w"), CoreMatchers.equalTo("ubvaw"))
    }
}
