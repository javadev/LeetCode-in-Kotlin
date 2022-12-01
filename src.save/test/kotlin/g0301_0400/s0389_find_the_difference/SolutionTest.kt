package g0301_0400.s0389_find_the_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheDifference() {
        assertThat(Solution().findTheDifference("abcd", "abcde"), equalTo('e'))
    }

    @Test
    fun findTheDifference2() {
        assertThat(Solution().findTheDifference("", "y"), equalTo('y'))
    }

    @Test
    fun findTheDifference3() {
        assertThat(Solution().findTheDifference("a", "aa"), equalTo('a'))
    }

    @Test
    fun findTheDifference4() {
        assertThat(Solution().findTheDifference("ae", "aea"), equalTo('a'))
    }
}
