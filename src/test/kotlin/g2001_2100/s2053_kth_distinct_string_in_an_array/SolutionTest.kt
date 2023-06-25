package g2001_2100.s2053_kth_distinct_string_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthDistinct() {
        assertThat(
            Solution().kthDistinct(arrayOf("d", "b", "c", "b", "c", "a"), 2),
            equalTo("a")
        )
    }

    @Test
    fun kthDistinct2() {
        assertThat(Solution().kthDistinct(arrayOf("aaa", "aa", "a"), 1), equalTo("aaa"))
    }

    @Test
    fun kthDistinct3() {
        assertThat(Solution().kthDistinct(arrayOf("a", "b", "a"), 3), equalTo(""))
    }
}
