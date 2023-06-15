package g1601_1700.s1657_determine_if_two_strings_are_close

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun closeStrings() {
        assertThat(Solution().closeStrings("abc", "bca"), equalTo(true))
    }

    @Test
    fun closeStrings2() {
        assertThat(Solution().closeStrings("a", "aa"), equalTo(false))
    }

    @Test
    fun closeStrings3() {
        assertThat(Solution().closeStrings("cabbba", "abbccc"), equalTo(true))
    }

    @Test
    fun closeStrings4() {
        assertThat(Solution().closeStrings("aa", "aa"), equalTo(true))
    }

    @Test
    fun closeStrings5() {
        assertThat(Solution().closeStrings("a", "b"), equalTo(false))
    }
}
