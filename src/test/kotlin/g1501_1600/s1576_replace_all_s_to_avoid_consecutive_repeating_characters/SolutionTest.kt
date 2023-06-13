package g1501_1600.s1576_replace_all_s_to_avoid_consecutive_repeating_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun modifyString() {
        assertThat(Solution().modifyString("?zs"), equalTo("azs"))
    }

    @Test
    fun modifyString2() {
        assertThat(Solution().modifyString("ubv?w"), equalTo("ubvaw"))
    }
}
