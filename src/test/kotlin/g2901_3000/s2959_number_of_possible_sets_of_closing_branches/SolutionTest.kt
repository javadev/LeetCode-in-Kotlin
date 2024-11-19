package g2901_3000.s2959_number_of_possible_sets_of_closing_branches

import com_github_leetcode.CommonUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSets() {
        assertThat(
            Solution()
                .numberOfSets(
                    3,
                    5,
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1,2],[1,2,10],[0,2,10]",
                    ),
                ),
            equalTo(5),
        )
    }

    @Test
    fun numberOfSets2() {
        assertThat(
            Solution()
                .numberOfSets(
                    3,
                    5,
                    CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1,20],[0,1,10],[1,2,2],[0,2,2]",
                    ),
                ),
            equalTo(7),
        )
    }

    @Test
    fun numberOfSets3() {
        assertThat(Solution().numberOfSets(1, 10, arrayOf()), equalTo(2))
    }
}
