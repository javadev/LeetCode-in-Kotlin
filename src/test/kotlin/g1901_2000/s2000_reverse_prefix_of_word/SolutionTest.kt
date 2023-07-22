package g1901_2000.s2000_reverse_prefix_of_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reversePrefix() {
        assertThat(Solution().reversePrefix("abcdefd", 'd'), equalTo("dcbaefd"))
    }

    @Test
    fun reversePrefix2() {
        assertThat(Solution().reversePrefix("xyxzxe", 'z'), equalTo("zxyxxe"))
    }

    @Test
    fun reversePrefix3() {
        assertThat(Solution().reversePrefix("abcd", 'z'), equalTo("abcd"))
    }
}
