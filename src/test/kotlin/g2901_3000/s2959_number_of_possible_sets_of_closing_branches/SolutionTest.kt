package g2901_3000.s2959_number_of_possible_sets_of_closing_branches

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSets() {
        MatcherAssert.assertThat(
            Solution()
                .numberOfSets(
                    3,
                    5,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1,2],[1,2,10],[0,2,10]"
                    )
                ),
            CoreMatchers.equalTo(5)
        )
    }

    @Test
    fun numberOfSets2() {
        MatcherAssert.assertThat(
            Solution()
                .numberOfSets(
                    3,
                    5,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[0,1,20],[0,1,10],[1,2,2],[0,2,2]"
                    )
                ),
            CoreMatchers.equalTo(7)
        )
    }

    @Test
    fun numberOfSets3() {
        MatcherAssert.assertThat(Solution().numberOfSets(1, 10, arrayOf()), CoreMatchers.equalTo(2))
    }
}
