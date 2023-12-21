package g2801_2900.s2867_count_valid_paths_in_a_tree

import com_github_leetcode.CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPaths() {
        MatcherAssert.assertThat(
            Solution()
                .countPaths(
                    5,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[1,3],[2,4],[2,5]"
                    )
                ),
            CoreMatchers.equalTo(4L)
        )
    }

    @Test
    fun countPaths2() {
        MatcherAssert.assertThat(
            Solution()
                .countPaths(
                    6,
                    convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[1,3],[2,4],[3,5],[3,6]"
                    )
                ),
            CoreMatchers.equalTo(6L)
        )
    }
}
