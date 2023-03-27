package g0001_0100.s0038_count_and_say

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countAndSay() {
        assertThat(Solution().countAndSay(1), equalTo("1"))
    }

    @Test
    fun countAndSay2() {
        assertThat(Solution().countAndSay(2), equalTo("11"))
    }

    @Test
    fun countAndSay3() {
        assertThat(Solution().countAndSay(3), equalTo("21"))
    }

    @Test
    fun countAndSay4() {
        assertThat(Solution().countAndSay(4), equalTo("1211"))
    }
}
