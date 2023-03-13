package g0701_0800.s0791_custom_sort_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun customSortString() {
        assertThat(Solution().customSortString("cba", "abcd"), equalTo("cbad"))
    }

    @Test
    fun customSortString2() {
        assertThat(Solution().customSortString("cbafg", "abcd"), equalTo("cbad"))
    }
}
