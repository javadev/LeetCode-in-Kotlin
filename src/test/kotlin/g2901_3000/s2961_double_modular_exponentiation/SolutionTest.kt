package g2901_3000.s2961_double_modular_exponentiation

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodIndices() {
        assertThat(
            Solution()
                .getGoodIndices(
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[2,3,3,10],[3,3,3,1],[6,1,1,4]"
                    ),
                    2
                ),
            equalTo(listOf(0, 2))
        )
    }

    @Test
    fun goodIndices2() {
        assertThat(
            Solution().getGoodIndices(arrayOf(intArrayOf(39, 3, 1000, 1000)), 17),
            equalTo(listOf<Any>())
        )
    }
}
