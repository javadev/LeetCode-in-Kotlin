package g0901_1000.s0932_beautiful_array

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun beautifulArray() {
        val result = Solution().beautifulArray(4)
        val expected = intArrayOf(2, 1, 4, 3)
        assertThat(CommonUtils().compareArray(result!!, expected), equalTo(true))
    }

    @Test
    fun beautifulArray2() {
        val result = Solution().beautifulArray(5)
        val expected = intArrayOf(3, 1, 2, 5, 4)
        assertThat(CommonUtils().compareArray(result!!, expected), equalTo(true))
    }
}
