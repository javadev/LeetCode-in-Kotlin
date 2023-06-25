package g2101_2200.s2157_groups_of_strings

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun groupStrings() {
        MatcherAssert.assertThat(
            Solution().groupStrings(arrayOf("a", "b", "ab", "cde")),
            CoreMatchers.equalTo(intArrayOf(2, 3))
        )
    }

    @Test
    fun groupStrings2() {
        MatcherAssert.assertThat(
            Solution().groupStrings(arrayOf("a", "ab", "abc")),
            CoreMatchers.equalTo(intArrayOf(1, 3))
        )
    }
}
