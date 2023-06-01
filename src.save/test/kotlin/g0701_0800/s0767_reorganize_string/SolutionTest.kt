package g0701_0800.s0767_reorganize_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reorganizeString() {
        assertThat(Solution().reorganizeString("aab"), equalTo("aba"))
    }

    @Test
    fun reorganizeString2() {
        assertThat(Solution().reorganizeString("aaab"), equalTo(""))
    }

    @Test
    fun reorganizeString3() {
        assertThat(Solution().reorganizeString("aaabbbb"), equalTo("bababab"))
    }

    @Test
    fun reorganizeString4() {
        assertThat(Solution().reorganizeString("vvvlo"), equalTo("vlvov"))
    }
}
