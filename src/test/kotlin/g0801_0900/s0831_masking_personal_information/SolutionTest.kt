package g0801_0900.s0831_masking_personal_information

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maskPII() {
        assertThat(
            Solution().maskPII("LeetCode@LeetCode.com"), equalTo("l*****e@leetcode.com")
        )
    }

    @Test
    fun maskPII2() {
        assertThat(Solution().maskPII("AB@qq.com"), equalTo("a*****b@qq.com"))
    }

    @Test
    fun maskPII3() {
        assertThat(Solution().maskPII("1(234)567-890"), equalTo("***-***-7890"))
    }
}
