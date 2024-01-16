package g2901_3000.s2961_double_modular_exponentiation

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodIndices() {
            MatcherAssert.assertThat(
                Solution()
                    .getGoodIndices(
                        convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                            "[2,3,3,10],[3,3,3,1],[6,1,1,4]"
                        ),
                        2
                    ),
                CoreMatchers.equalTo(listOf(0, 2))
            )
        }

    @Test
    fun goodIndices2() {
            MatcherAssert.assertThat(
                Solution().getGoodIndices(arrayOf(intArrayOf(39, 3, 1000, 1000)), 17),
                CoreMatchers.equalTo(listOf<Any>())
            )
        }
}
