package g2901_3000.s2930_number_of_strings_which_can_be_rearranged_to_contain_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stringCount() {
        assertThat(Solution().stringCount(4), equalTo(12))
    }

    @Test
    fun stringCount2() {
        assertThat(Solution().stringCount(10), equalTo(83943898))
    }
}
