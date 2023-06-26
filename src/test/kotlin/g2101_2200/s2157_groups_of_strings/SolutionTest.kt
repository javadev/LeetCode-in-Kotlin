package g2101_2200.s2157_groups_of_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun groupStrings() {
        assertThat(
            Solution().groupStrings(arrayOf("a", "b", "ab", "cde")),
            equalTo(intArrayOf(2, 3))
        )
    }

    @Test
    fun groupStrings2() {
        assertThat(
            Solution().groupStrings(arrayOf("a", "ab", "abc")),
            equalTo(intArrayOf(1, 3))
        )
    }
}
