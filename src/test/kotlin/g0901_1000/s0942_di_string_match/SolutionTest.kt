package g0901_1000.s0942_di_string_match

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun diStringMatch() {
        assertThat(
            CommonUtils.compareArray(
                Solution().diStringMatch("IDID"), intArrayOf(0, 4, 1, 3, 2)
            ),
            equalTo(true)
        )
    }

    @Test
    fun diStringMatch2() {
        assertThat(Solution().diStringMatch("III"), equalTo(intArrayOf(0, 1, 2, 3)))
    }

    @Test
    fun diStringMatch3() {
        assertThat(Solution().diStringMatch("DDI"), equalTo(intArrayOf(3, 2, 0, 1)))
    }
}
