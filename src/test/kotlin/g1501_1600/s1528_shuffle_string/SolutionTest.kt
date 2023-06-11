package g1501_1600.s1528_shuffle_string

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun restoreString() {
        MatcherAssert.assertThat(
            Solution().restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)),
            CoreMatchers.equalTo("leetcode")
        )
    }

    @Test
    fun restoreString2() {
        MatcherAssert.assertThat(Solution().restoreString("abc", intArrayOf(0, 1, 2)), CoreMatchers.equalTo("abc"))
    }
}
