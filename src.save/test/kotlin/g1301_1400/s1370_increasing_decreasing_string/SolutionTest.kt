package g1301_1400.s1370_increasing_decreasing_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortString() {
        assertThat(Solution().sortString("aaaabbbbcccc"), equalTo("abccbaabccba"))
    }

    @Test
    fun sortString2() {
        assertThat(Solution().sortString("rat"), equalTo("art"))
    }
}
