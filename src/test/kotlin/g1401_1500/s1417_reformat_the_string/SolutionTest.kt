package g1401_1500.s1417_reformat_the_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reformat() {
        assertThat(Solution().reformat("a0b1c2"), equalTo("a0b1c2"))
    }

    @Test
    fun reformat2() {
        assertThat(Solution().reformat("leetcode"), equalTo(""))
    }

    @Test
    fun reformat3() {
        assertThat(Solution().reformat("1229857369"), equalTo(""))
    }
}
