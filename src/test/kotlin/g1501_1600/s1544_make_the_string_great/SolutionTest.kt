package g1501_1600.s1544_make_the_string_great

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeGood() {
        MatcherAssert.assertThat(Solution().makeGood("leEeetcode"), CoreMatchers.equalTo("leetcode"))
    }

    @Test
    fun makeGood2() {
        MatcherAssert.assertThat(Solution().makeGood("abBAcC"), CoreMatchers.equalTo(""))
    }

    @Test
    fun makeGood3() {
        MatcherAssert.assertThat(Solution().makeGood("s"), CoreMatchers.equalTo("s"))
    }
}
