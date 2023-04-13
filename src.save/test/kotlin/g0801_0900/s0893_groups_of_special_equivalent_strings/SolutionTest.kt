package g0801_0900.s0893_groups_of_special_equivalent_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSpecialEquivGroups() {
        assertThat(
            Solution()
                .numSpecialEquivGroups(arrayOf("abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx")),
            equalTo(3)
        )
    }

    @Test
    fun numSpecialEquivGroups2() {
        assertThat(
            Solution()
                .numSpecialEquivGroups(arrayOf("abc", "acb", "bac", "bca", "cab", "cba")),
            equalTo(3)
        )
    }
}
