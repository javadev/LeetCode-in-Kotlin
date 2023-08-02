package g0001_0100.s0089_gray_code

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun grayCode() {
        assertThat(Solution().grayCode(2), equalTo(intArrayOf(0, 1, 3, 2).asList()))
    }

    @Test
    fun grayCode2() {
        assertThat(Solution().grayCode(1), equalTo(intArrayOf(0, 1).asList()))
    }
}
