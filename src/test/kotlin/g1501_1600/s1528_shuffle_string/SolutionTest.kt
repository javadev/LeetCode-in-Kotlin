package g1501_1600.s1528_shuffle_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun restoreString() {
        assertThat(
            Solution().restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)),
            equalTo("leetcode")
        )
    }

    @Test
    fun restoreString2() {
        assertThat(Solution().restoreString("abc", intArrayOf(0, 1, 2)), equalTo("abc"))
    }
}
