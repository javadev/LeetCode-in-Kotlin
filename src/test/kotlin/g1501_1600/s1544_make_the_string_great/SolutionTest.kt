package g1501_1600.s1544_make_the_string_great

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeGood() {
        assertThat(Solution().makeGood("leEeetcode"), equalTo("leetcode"))
    }

    @Test
    fun makeGood2() {
        assertThat(Solution().makeGood("abBAcC"), equalTo(""))
    }

    @Test
    fun makeGood3() {
        assertThat(Solution().makeGood("s"), equalTo("s"))
    }
}
